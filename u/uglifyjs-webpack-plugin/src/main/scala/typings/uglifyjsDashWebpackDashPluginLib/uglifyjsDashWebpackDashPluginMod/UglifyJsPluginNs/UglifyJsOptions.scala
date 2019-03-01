package typings
package uglifyjsDashWebpackDashPluginLib.uglifyjsDashWebpackDashPluginMod.UglifyJsPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UglifyJsOptions extends js.Object {
  var compress: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var ecma: js.UndefOr[scala.Double] = js.undefined
  var ie8: js.UndefOr[scala.Boolean] = js.undefined
  var keep_classnames: js.UndefOr[scala.Boolean] = js.undefined
  var keep_fnames: js.UndefOr[scala.Boolean] = js.undefined
  var mangle: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var nameCache: js.UndefOr[js.Object] = js.undefined
  var output: js.UndefOr[js.Object] = js.undefined
  var parse: js.UndefOr[js.Object] = js.undefined
  var safari10: js.UndefOr[scala.Boolean] = js.undefined
  var toplevel: js.UndefOr[scala.Boolean] = js.undefined
  var warnings: js.UndefOr[scala.Boolean] = js.undefined
}

object UglifyJsOptions {
  @scala.inline
  def apply(
    compress: scala.Boolean | js.Object = null,
    ecma: scala.Int | scala.Double = null,
    ie8: js.UndefOr[scala.Boolean] = js.undefined,
    keep_classnames: js.UndefOr[scala.Boolean] = js.undefined,
    keep_fnames: js.UndefOr[scala.Boolean] = js.undefined,
    mangle: scala.Boolean | js.Object = null,
    nameCache: js.Object = null,
    output: js.Object = null,
    parse: js.Object = null,
    safari10: js.UndefOr[scala.Boolean] = js.undefined,
    toplevel: js.UndefOr[scala.Boolean] = js.undefined,
    warnings: js.UndefOr[scala.Boolean] = js.undefined
  ): UglifyJsOptions = {
    val __obj = js.Dynamic.literal()
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (ecma != null) __obj.updateDynamic("ecma")(ecma.asInstanceOf[js.Any])
    if (!js.isUndefined(ie8)) __obj.updateDynamic("ie8")(ie8)
    if (!js.isUndefined(keep_classnames)) __obj.updateDynamic("keep_classnames")(keep_classnames)
    if (!js.isUndefined(keep_fnames)) __obj.updateDynamic("keep_fnames")(keep_fnames)
    if (mangle != null) __obj.updateDynamic("mangle")(mangle.asInstanceOf[js.Any])
    if (nameCache != null) __obj.updateDynamic("nameCache")(nameCache)
    if (output != null) __obj.updateDynamic("output")(output)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (!js.isUndefined(safari10)) __obj.updateDynamic("safari10")(safari10)
    if (!js.isUndefined(toplevel)) __obj.updateDynamic("toplevel")(toplevel)
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[UglifyJsOptions]
  }
}

