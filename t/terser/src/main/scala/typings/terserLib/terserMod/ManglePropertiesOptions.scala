package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManglePropertiesOptions extends js.Object {
  var builtins: js.UndefOr[scala.Boolean] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var keep_quoted: js.UndefOr[scala.Boolean] = js.undefined
  var regex: js.UndefOr[stdLib.RegExp | java.lang.String] = js.undefined
  var reserved: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ManglePropertiesOptions {
  @scala.inline
  def apply(
    builtins: js.UndefOr[scala.Boolean] = js.undefined,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    keep_quoted: js.UndefOr[scala.Boolean] = js.undefined,
    regex: stdLib.RegExp | java.lang.String = null,
    reserved: js.Array[java.lang.String] = null
  ): ManglePropertiesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(builtins)) __obj.updateDynamic("builtins")(builtins)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(keep_quoted)) __obj.updateDynamic("keep_quoted")(keep_quoted)
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (reserved != null) __obj.updateDynamic("reserved")(reserved)
    __obj.asInstanceOf[ManglePropertiesOptions]
  }
}

