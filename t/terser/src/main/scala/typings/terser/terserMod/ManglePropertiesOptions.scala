package typings.terser.terserMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManglePropertiesOptions extends js.Object {
  var builtins: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var keep_quoted: js.UndefOr[Boolean] = js.undefined
  var regex: js.UndefOr[RegExp | String] = js.undefined
  var reserved: js.UndefOr[js.Array[String]] = js.undefined
}

object ManglePropertiesOptions {
  @scala.inline
  def apply(
    builtins: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    keep_quoted: js.UndefOr[Boolean] = js.undefined,
    regex: RegExp | String = null,
    reserved: js.Array[String] = null
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

