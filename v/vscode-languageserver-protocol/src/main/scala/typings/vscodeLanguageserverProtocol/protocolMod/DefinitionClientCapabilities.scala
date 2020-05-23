package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionClientCapabilities extends js.Object {
  /**
    * Whether definition supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * The client supports additional metadata in the form of definition links.
    *
    * @since 3.14.0
    */
  var linkSupport: js.UndefOr[Boolean] = js.undefined
}

object DefinitionClientCapabilities {
  @scala.inline
  def apply(
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined,
    linkSupport: js.UndefOr[Boolean] = js.undefined
  ): DefinitionClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linkSupport)) __obj.updateDynamic("linkSupport")(linkSupport.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionClientCapabilities]
  }
}

