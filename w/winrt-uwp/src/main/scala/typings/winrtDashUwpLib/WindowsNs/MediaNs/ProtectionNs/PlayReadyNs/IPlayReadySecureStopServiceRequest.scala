package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages secure stop messages. */
trait IPlayReadySecureStopServiceRequest extends IPlayReadyServiceRequest {
  /** Gets the current publisher certificate property. */
  var publisherCertificate: scala.Double
  /** Gets the secure stop session identifier property. */
  var sessionID: java.lang.String
  /** Gets the secure stop session's start time property. */
  var startTime: stdLib.Date
  /** Gets the secure stop session's stopped flag property which indicates whether the secure stop session for this request was cleanly shut down. */
  var stopped: scala.Boolean
  /** Gets the secure stop session's update/stop time property. */
  var updateTime: stdLib.Date
}

object IPlayReadySecureStopServiceRequest {
  @scala.inline
  def apply(
    beginServiceRequest: js.Function0[winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncAction],
    challengeCustomData: java.lang.String,
    generateManualEnablingChallenge: js.Function0[PlayReadySoapMessage],
    nextServiceRequest: js.Function0[IPlayReadyServiceRequest],
    processManualEnablingResponse: js.Function1[js.Array[scala.Double], winrtDashUwpLib.WindowsNs.WinRTError],
    protectionSystem: java.lang.String,
    publisherCertificate: scala.Double,
    responseCustomData: java.lang.String,
    sessionID: java.lang.String,
    startTime: stdLib.Date,
    stopped: scala.Boolean,
    `type`: java.lang.String,
    updateTime: stdLib.Date,
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri
  ): IPlayReadySecureStopServiceRequest = {
    val __obj = js.Dynamic.literal(beginServiceRequest = beginServiceRequest, challengeCustomData = challengeCustomData, generateManualEnablingChallenge = generateManualEnablingChallenge, nextServiceRequest = nextServiceRequest, processManualEnablingResponse = processManualEnablingResponse, protectionSystem = protectionSystem, publisherCertificate = publisherCertificate, responseCustomData = responseCustomData, sessionID = sessionID, startTime = startTime, stopped = stopped, updateTime = updateTime, uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPlayReadySecureStopServiceRequest]
  }
}

