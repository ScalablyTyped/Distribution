package typings
package swaggerDashParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Circular extends js.Object {
  var circular: js.UndefOr[scala.Boolean | swaggerDashParserLib.swaggerDashParserLibStrings.ignore] = js.undefined
  var external: js.UndefOr[scala.Boolean] = js.undefined
  var internal: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Circular {
  @scala.inline
  def apply(
    circular: scala.Boolean | swaggerDashParserLib.swaggerDashParserLibStrings.ignore = null,
    external: js.UndefOr[scala.Boolean] = js.undefined,
    internal: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Circular = {
    val __obj = js.Dynamic.literal()
    if (circular != null) __obj.updateDynamic("circular")(circular.asInstanceOf[js.Any])
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external)
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    __obj.asInstanceOf[Anon_Circular]
  }
}

