package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import typings.winrtDashUwp.Windows.Foundation.IAsyncAction
import typings.winrtDashUwp.Windows.Foundation.Uri
import typings.winrtDashUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Performs a license acquisition process. */
trait IPlayReadyLicenseAcquisitionServiceRequest extends IPlayReadyServiceRequest {
  /** Gets the current content header property. */
  var contentHeader: PlayReadyContentHeader
  /** Gets the current domain service identifier property that overrides a service identifier in the content header. */
  var domainServiceId: String
}

object IPlayReadyLicenseAcquisitionServiceRequest {
  @scala.inline
  def apply(
    beginServiceRequest: () => IAsyncAction,
    challengeCustomData: String,
    contentHeader: PlayReadyContentHeader,
    domainServiceId: String,
    generateManualEnablingChallenge: () => PlayReadySoapMessage,
    nextServiceRequest: () => IPlayReadyServiceRequest,
    processManualEnablingResponse: js.Array[Double] => WinRTError,
    protectionSystem: String,
    responseCustomData: String,
    `type`: String,
    uri: Uri
  ): IPlayReadyLicenseAcquisitionServiceRequest = {
    val __obj = js.Dynamic.literal(beginServiceRequest = js.Any.fromFunction0(beginServiceRequest), challengeCustomData = challengeCustomData, contentHeader = contentHeader, domainServiceId = domainServiceId, generateManualEnablingChallenge = js.Any.fromFunction0(generateManualEnablingChallenge), nextServiceRequest = js.Any.fromFunction0(nextServiceRequest), processManualEnablingResponse = js.Any.fromFunction1(processManualEnablingResponse), protectionSystem = protectionSystem, responseCustomData = responseCustomData, uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPlayReadyLicenseAcquisitionServiceRequest]
  }
}

