package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.MarkupKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverClientCapabilities extends js.Object {
  /**
    * Client supports the follow content formats for the content
    * property. The order describes the preferred format of the client.
    */
  var contentFormat: js.UndefOr[js.Array[MarkupKind]] = js.undefined
  /**
    * Whether hover supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}

object HoverClientCapabilities {
  @scala.inline
  def apply(
    contentFormat: js.Array[MarkupKind] = null,
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  ): HoverClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (contentFormat != null) __obj.updateDynamic("contentFormat")(contentFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverClientCapabilities]
  }
}

