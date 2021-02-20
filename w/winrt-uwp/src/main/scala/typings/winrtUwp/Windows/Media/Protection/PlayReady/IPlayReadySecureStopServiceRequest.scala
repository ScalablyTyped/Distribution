package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.IAsyncAction
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages secure stop messages. */
@js.native
trait IPlayReadySecureStopServiceRequest extends IPlayReadyServiceRequest {
  
  /** Gets the current publisher certificate property. */
  var publisherCertificate: Double = js.native
  
  /** Gets the secure stop session identifier property. */
  var sessionID: String = js.native
  
  /** Gets the secure stop session's start time property. */
  var startTime: Date = js.native
  
  /** Gets the secure stop session's stopped flag property which indicates whether the secure stop session for this request was cleanly shut down. */
  var stopped: Boolean = js.native
  
  /** Gets the secure stop session's update/stop time property. */
  var updateTime: Date = js.native
}
object IPlayReadySecureStopServiceRequest {
  
  @scala.inline
  def apply(
    beginServiceRequest: () => IAsyncAction,
    challengeCustomData: String,
    generateManualEnablingChallenge: () => PlayReadySoapMessage,
    nextServiceRequest: () => IPlayReadyServiceRequest,
    processManualEnablingResponse: js.Array[Double] => WinRTError,
    protectionSystem: String,
    publisherCertificate: Double,
    responseCustomData: String,
    sessionID: String,
    startTime: Date,
    stopped: Boolean,
    `type`: String,
    updateTime: Date,
    uri: Uri
  ): IPlayReadySecureStopServiceRequest = {
    val __obj = js.Dynamic.literal(beginServiceRequest = js.Any.fromFunction0(beginServiceRequest), challengeCustomData = challengeCustomData.asInstanceOf[js.Any], generateManualEnablingChallenge = js.Any.fromFunction0(generateManualEnablingChallenge), nextServiceRequest = js.Any.fromFunction0(nextServiceRequest), processManualEnablingResponse = js.Any.fromFunction1(processManualEnablingResponse), protectionSystem = protectionSystem.asInstanceOf[js.Any], publisherCertificate = publisherCertificate.asInstanceOf[js.Any], responseCustomData = responseCustomData.asInstanceOf[js.Any], sessionID = sessionID.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stopped = stopped.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayReadySecureStopServiceRequest]
  }
  
  @scala.inline
  implicit class IPlayReadySecureStopServiceRequestMutableBuilder[Self <: IPlayReadySecureStopServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublisherCertificate(value: Double): Self = StObject.set(x, "publisherCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionID(value: String): Self = StObject.set(x, "sessionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTime(value: Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
