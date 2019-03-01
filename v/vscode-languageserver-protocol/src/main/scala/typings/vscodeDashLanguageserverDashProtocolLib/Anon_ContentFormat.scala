package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentFormat extends js.Object {
  /**
    * Client supports the follow content formats for the content
    * property. The order describes the preferred format of the client.
    */
  var contentFormat: js.UndefOr[
    js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.MarkupKind
    ]
  ] = js.undefined
  /**
    * Whether hover supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ContentFormat {
  @scala.inline
  def apply(
    contentFormat: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.MarkupKind
    ] = null,
    dynamicRegistration: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ContentFormat = {
    val __obj = js.Dynamic.literal()
    if (contentFormat != null) __obj.updateDynamic("contentFormat")(contentFormat)
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration)
    __obj.asInstanceOf[Anon_ContentFormat]
  }
}

