package typings.vscodeLanguageserverProtocol.protocolImplementationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImplementationClientCapabilities extends js.Object {
  /**
    * Whether implementation supports dynamic registration. If this is set to `true`
    * the client supports the new `ImplementationRegistrationOptions` return value
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

object ImplementationClientCapabilities {
  @scala.inline
  def apply(
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined,
    linkSupport: js.UndefOr[Boolean] = js.undefined
  ): ImplementationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linkSupport)) __obj.updateDynamic("linkSupport")(linkSupport.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationClientCapabilities]
  }
}

