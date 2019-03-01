package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MangleOptions extends js.Object {
  var eval: js.UndefOr[scala.Boolean] = js.undefined
  var keep_classnames: js.UndefOr[scala.Boolean | stdLib.RegExp] = js.undefined
  var keep_fnames: js.UndefOr[scala.Boolean | stdLib.RegExp] = js.undefined
  var module: js.UndefOr[scala.Boolean] = js.undefined
  var properties: js.UndefOr[scala.Boolean | ManglePropertiesOptions] = js.undefined
  var reserved: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var safari10: js.UndefOr[scala.Boolean] = js.undefined
  var toplevel: js.UndefOr[scala.Boolean] = js.undefined
}

object MangleOptions {
  @scala.inline
  def apply(
    eval: js.UndefOr[scala.Boolean] = js.undefined,
    keep_classnames: scala.Boolean | stdLib.RegExp = null,
    keep_fnames: scala.Boolean | stdLib.RegExp = null,
    module: js.UndefOr[scala.Boolean] = js.undefined,
    properties: scala.Boolean | ManglePropertiesOptions = null,
    reserved: js.Array[java.lang.String] = null,
    safari10: js.UndefOr[scala.Boolean] = js.undefined,
    toplevel: js.UndefOr[scala.Boolean] = js.undefined
  ): MangleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(eval)) __obj.updateDynamic("eval")(eval)
    if (keep_classnames != null) __obj.updateDynamic("keep_classnames")(keep_classnames.asInstanceOf[js.Any])
    if (keep_fnames != null) __obj.updateDynamic("keep_fnames")(keep_fnames.asInstanceOf[js.Any])
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module)
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (reserved != null) __obj.updateDynamic("reserved")(reserved)
    if (!js.isUndefined(safari10)) __obj.updateDynamic("safari10")(safari10)
    if (!js.isUndefined(toplevel)) __obj.updateDynamic("toplevel")(toplevel)
    __obj.asInstanceOf[MangleOptions]
  }
}

