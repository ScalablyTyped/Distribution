package typings
package xmlrpcLib.xmlrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFormatterOptions extends js.Object {
  var colons: js.UndefOr[scala.Boolean] = js.undefined
  var hyphens: js.UndefOr[scala.Boolean] = js.undefined
  var local: js.UndefOr[scala.Boolean] = js.undefined
  var ms: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[scala.Boolean] = js.undefined
}

object DateFormatterOptions {
  @scala.inline
  def apply(
    colons: js.UndefOr[scala.Boolean] = js.undefined,
    hyphens: js.UndefOr[scala.Boolean] = js.undefined,
    local: js.UndefOr[scala.Boolean] = js.undefined,
    ms: js.UndefOr[scala.Boolean] = js.undefined,
    offset: js.UndefOr[scala.Boolean] = js.undefined
  ): DateFormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colons)) __obj.updateDynamic("colons")(colons)
    if (!js.isUndefined(hyphens)) __obj.updateDynamic("hyphens")(hyphens)
    if (!js.isUndefined(local)) __obj.updateDynamic("local")(local)
    if (!js.isUndefined(ms)) __obj.updateDynamic("ms")(ms)
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[DateFormatterOptions]
  }
}

