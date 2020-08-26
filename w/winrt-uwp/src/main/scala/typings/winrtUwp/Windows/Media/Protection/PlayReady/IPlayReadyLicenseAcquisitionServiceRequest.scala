package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.IAsyncAction
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Performs a license acquisition process. */
@js.native
trait IPlayReadyLicenseAcquisitionServiceRequest extends IPlayReadyServiceRequest {
  /** Gets the current content header property. */
  var contentHeader: PlayReadyContentHeader = js.native
  /** Gets the current domain service identifier property that overrides a service identifier in the content header. */
  var domainServiceId: String = js.native
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
    val __obj = js.Dynamic.literal(beginServiceRequest = js.Any.fromFunction0(beginServiceRequest), challengeCustomData = challengeCustomData.asInstanceOf[js.Any], contentHeader = contentHeader.asInstanceOf[js.Any], domainServiceId = domainServiceId.asInstanceOf[js.Any], generateManualEnablingChallenge = js.Any.fromFunction0(generateManualEnablingChallenge), nextServiceRequest = js.Any.fromFunction0(nextServiceRequest), processManualEnablingResponse = js.Any.fromFunction1(processManualEnablingResponse), protectionSystem = protectionSystem.asInstanceOf[js.Any], responseCustomData = responseCustomData.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayReadyLicenseAcquisitionServiceRequest]
  }
  @scala.inline
  implicit class IPlayReadyLicenseAcquisitionServiceRequestOps[Self <: IPlayReadyLicenseAcquisitionServiceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentHeader(value: PlayReadyContentHeader): Self = this.set("contentHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainServiceId(value: String): Self = this.set("domainServiceId", value.asInstanceOf[js.Any])
  }
  
}

