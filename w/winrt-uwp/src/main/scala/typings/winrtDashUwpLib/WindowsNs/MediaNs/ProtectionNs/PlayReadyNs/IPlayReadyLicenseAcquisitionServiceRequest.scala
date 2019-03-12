package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Performs a license acquisition process. */
trait IPlayReadyLicenseAcquisitionServiceRequest extends IPlayReadyServiceRequest {
  /** Gets the current content header property. */
  var contentHeader: PlayReadyContentHeader
  /** Gets the current domain service identifier property that overrides a service identifier in the content header. */
  var domainServiceId: java.lang.String
}

object IPlayReadyLicenseAcquisitionServiceRequest {
  @scala.inline
  def apply(
    beginServiceRequest: () => winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncAction,
    challengeCustomData: java.lang.String,
    contentHeader: PlayReadyContentHeader,
    domainServiceId: java.lang.String,
    generateManualEnablingChallenge: () => PlayReadySoapMessage,
    nextServiceRequest: () => IPlayReadyServiceRequest,
    processManualEnablingResponse: js.Array[scala.Double] => winrtDashUwpLib.WindowsNs.WinRTError,
    protectionSystem: java.lang.String,
    responseCustomData: java.lang.String,
    `type`: java.lang.String,
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri
  ): IPlayReadyLicenseAcquisitionServiceRequest = {
    val __obj = js.Dynamic.literal(beginServiceRequest = js.Any.fromFunction0(beginServiceRequest), challengeCustomData = challengeCustomData, contentHeader = contentHeader, domainServiceId = domainServiceId, generateManualEnablingChallenge = js.Any.fromFunction0(generateManualEnablingChallenge), nextServiceRequest = js.Any.fromFunction0(nextServiceRequest), processManualEnablingResponse = js.Any.fromFunction1(processManualEnablingResponse), protectionSystem = protectionSystem, responseCustomData = responseCustomData, uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPlayReadyLicenseAcquisitionServiceRequest]
  }
}

