package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import typings.std.Date
import typings.winrtDashUwp.Windows.Foundation.IAsyncAction
import typings.winrtDashUwp.Windows.Foundation.Uri
import typings.winrtDashUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages secure stop messages. */
trait IPlayReadySecureStopServiceRequest extends IPlayReadyServiceRequest {
  /** Gets the current publisher certificate property. */
  var publisherCertificate: Double
  /** Gets the secure stop session identifier property. */
  var sessionID: String
  /** Gets the secure stop session's start time property. */
  var startTime: Date
  /** Gets the secure stop session's stopped flag property which indicates whether the secure stop session for this request was cleanly shut down. */
  var stopped: Boolean
  /** Gets the secure stop session's update/stop time property. */
  var updateTime: Date
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
    val __obj = js.Dynamic.literal(beginServiceRequest = js.Any.fromFunction0(beginServiceRequest), challengeCustomData = challengeCustomData, generateManualEnablingChallenge = js.Any.fromFunction0(generateManualEnablingChallenge), nextServiceRequest = js.Any.fromFunction0(nextServiceRequest), processManualEnablingResponse = js.Any.fromFunction1(processManualEnablingResponse), protectionSystem = protectionSystem, publisherCertificate = publisherCertificate, responseCustomData = responseCustomData, sessionID = sessionID, startTime = startTime, stopped = stopped, updateTime = updateTime, uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPlayReadySecureStopServiceRequest]
  }
}

