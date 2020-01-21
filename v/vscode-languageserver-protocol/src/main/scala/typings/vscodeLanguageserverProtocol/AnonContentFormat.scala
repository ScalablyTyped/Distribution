package typings.vscodeLanguageserverProtocol

import typings.vscodeLanguageserverTypes.mod.MarkupKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentFormat extends js.Object {
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

object AnonContentFormat {
  @scala.inline
  def apply(
    contentFormat: js.Array[MarkupKind] = null,
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  ): AnonContentFormat = {
    val __obj = js.Dynamic.literal()
    if (contentFormat != null) __obj.updateDynamic("contentFormat")(contentFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentFormat]
  }
}

