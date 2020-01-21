package typings.terser.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MangleOptions extends js.Object {
  var eval: js.UndefOr[Boolean] = js.undefined
  var keep_classnames: js.UndefOr[Boolean | RegExp] = js.undefined
  var keep_fnames: js.UndefOr[Boolean | RegExp] = js.undefined
  var module: js.UndefOr[Boolean] = js.undefined
  var properties: js.UndefOr[Boolean | ManglePropertiesOptions] = js.undefined
  var reserved: js.UndefOr[js.Array[String]] = js.undefined
  var safari10: js.UndefOr[Boolean] = js.undefined
  var toplevel: js.UndefOr[Boolean] = js.undefined
}

object MangleOptions {
  @scala.inline
  def apply(
    eval: js.UndefOr[Boolean] = js.undefined,
    keep_classnames: Boolean | RegExp = null,
    keep_fnames: Boolean | RegExp = null,
    module: js.UndefOr[Boolean] = js.undefined,
    properties: Boolean | ManglePropertiesOptions = null,
    reserved: js.Array[String] = null,
    safari10: js.UndefOr[Boolean] = js.undefined,
    toplevel: js.UndefOr[Boolean] = js.undefined
  ): MangleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(eval)) __obj.updateDynamic("eval")(eval.asInstanceOf[js.Any])
    if (keep_classnames != null) __obj.updateDynamic("keep_classnames")(keep_classnames.asInstanceOf[js.Any])
    if (keep_fnames != null) __obj.updateDynamic("keep_fnames")(keep_fnames.asInstanceOf[js.Any])
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (reserved != null) __obj.updateDynamic("reserved")(reserved.asInstanceOf[js.Any])
    if (!js.isUndefined(safari10)) __obj.updateDynamic("safari10")(safari10.asInstanceOf[js.Any])
    if (!js.isUndefined(toplevel)) __obj.updateDynamic("toplevel")(toplevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[MangleOptions]
  }
}

