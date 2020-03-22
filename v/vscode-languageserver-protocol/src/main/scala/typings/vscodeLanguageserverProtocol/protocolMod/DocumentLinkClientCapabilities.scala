package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentLinkClientCapabilities extends js.Object {
  /**
    * Whether document link supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the client support the `tooltip` property on `DocumentLink`.
    *
    * @since 3.15.0
    */
  var tooltipSupport: js.UndefOr[Boolean] = js.undefined
}

object DocumentLinkClientCapabilities {
  @scala.inline
  def apply(
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined,
    tooltipSupport: js.UndefOr[Boolean] = js.undefined
  ): DocumentLinkClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipSupport)) __obj.updateDynamic("tooltipSupport")(tooltipSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLinkClientCapabilities]
  }
}

