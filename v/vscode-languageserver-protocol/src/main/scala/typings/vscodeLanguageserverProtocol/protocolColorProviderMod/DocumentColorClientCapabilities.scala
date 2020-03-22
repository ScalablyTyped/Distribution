package typings.vscodeLanguageserverProtocol.protocolColorProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentColorClientCapabilities extends js.Object {
  /**
    * Whether implementation supports dynamic registration. If this is set to `true`
    * the client supports the new `DocumentColorRegistrationOptions` return value
    * for the corresponding server capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}

object DocumentColorClientCapabilities {
  @scala.inline
  def apply(dynamicRegistration: js.UndefOr[Boolean] = js.undefined): DocumentColorClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentColorClientCapabilities]
  }
}

