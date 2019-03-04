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
    beginServiceRequest: js.Function0[winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncAction],
    challengeCustomData: java.lang.String,
    contentHeader: PlayReadyContentHeader,
    domainServiceId: java.lang.String,
    generateManualEnablingChallenge: js.Function0[PlayReadySoapMessage],
    nextServiceRequest: js.Function0[IPlayReadyServiceRequest],
    processManualEnablingResponse: js.Function1[js.Array[scala.Double], winrtDashUwpLib.WindowsNs.WinRTError],
    protectionSystem: java.lang.String,
    responseCustomData: java.lang.String,
    `type`: java.lang.String,
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri
  ): IPlayReadyLicenseAcquisitionServiceRequest = {
    val __obj = js.Dynamic.literal(beginServiceRequest = beginServiceRequest, challengeCustomData = challengeCustomData, contentHeader = contentHeader, domainServiceId = domainServiceId, generateManualEnablingChallenge = generateManualEnablingChallenge, nextServiceRequest = nextServiceRequest, processManualEnablingResponse = processManualEnablingResponse, protectionSystem = protectionSystem, responseCustomData = responseCustomData, uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPlayReadyLicenseAcquisitionServiceRequest]
  }
}

