package typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDefinitionClientCapabilities extends js.Object {
  /**
    * Whether implementation supports dynamic registration. If this is set to `true`
    * the client supports the new `TypeDefinitionRegistrationOptions` return value
    * for the corresponding server capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * The client supports additional metadata in the form of definition links.
    *
    * Since 3.14.0
    */
  var linkSupport: js.UndefOr[Boolean] = js.undefined
}

object TypeDefinitionClientCapabilities {
  @scala.inline
  def apply(
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined,
    linkSupport: js.UndefOr[Boolean] = js.undefined
  ): TypeDefinitionClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    if (!js.isUndefined(linkSupport)) __obj.updateDynamic("linkSupport")(linkSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionClientCapabilities]
  }
}

