package typings.vscodeLanguageserverProtocol.protocolDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationClientCapabilities extends js.Object {
  /**
    * Whether declaration supports dynamic registration. If this is set to `true`
    * the client supports the new `DeclarationRegistrationOptions` return value
    * for the corresponding server capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * The client supports additional metadata in the form of declaration links.
    */
  var linkSupport: js.UndefOr[Boolean] = js.undefined
}

object DeclarationClientCapabilities {
  @scala.inline
  def apply(
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined,
    linkSupport: js.UndefOr[Boolean] = js.undefined
  ): DeclarationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linkSupport)) __obj.updateDynamic("linkSupport")(linkSupport.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationClientCapabilities]
  }
}

