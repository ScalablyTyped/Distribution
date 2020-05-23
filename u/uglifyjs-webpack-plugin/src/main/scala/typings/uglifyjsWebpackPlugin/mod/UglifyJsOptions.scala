package typings.uglifyjsWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UglifyJsOptions extends js.Object {
  var compress: js.UndefOr[Boolean | js.Object] = js.undefined
  var ecma: js.UndefOr[Double] = js.undefined
  var ie8: js.UndefOr[Boolean] = js.undefined
  var keep_classnames: js.UndefOr[Boolean] = js.undefined
  var keep_fnames: js.UndefOr[Boolean] = js.undefined
  var mangle: js.UndefOr[Boolean | js.Object] = js.undefined
  var nameCache: js.UndefOr[js.Object] = js.undefined
  var output: js.UndefOr[js.Object] = js.undefined
  var parse: js.UndefOr[js.Object] = js.undefined
  var safari10: js.UndefOr[Boolean] = js.undefined
  var toplevel: js.UndefOr[Boolean] = js.undefined
  var warnings: js.UndefOr[Boolean] = js.undefined
}

object UglifyJsOptions {
  @scala.inline
  def apply(
    compress: Boolean | js.Object = null,
    ecma: js.UndefOr[Double] = js.undefined,
    ie8: js.UndefOr[Boolean] = js.undefined,
    keep_classnames: js.UndefOr[Boolean] = js.undefined,
    keep_fnames: js.UndefOr[Boolean] = js.undefined,
    mangle: Boolean | js.Object = null,
    nameCache: js.Object = null,
    output: js.Object = null,
    parse: js.Object = null,
    safari10: js.UndefOr[Boolean] = js.undefined,
    toplevel: js.UndefOr[Boolean] = js.undefined,
    warnings: js.UndefOr[Boolean] = js.undefined
  ): UglifyJsOptions = {
    val __obj = js.Dynamic.literal()
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (!js.isUndefined(ecma)) __obj.updateDynamic("ecma")(ecma.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ie8)) __obj.updateDynamic("ie8")(ie8.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_classnames)) __obj.updateDynamic("keep_classnames")(keep_classnames.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_fnames)) __obj.updateDynamic("keep_fnames")(keep_fnames.get.asInstanceOf[js.Any])
    if (mangle != null) __obj.updateDynamic("mangle")(mangle.asInstanceOf[js.Any])
    if (nameCache != null) __obj.updateDynamic("nameCache")(nameCache.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (!js.isUndefined(safari10)) __obj.updateDynamic("safari10")(safari10.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toplevel)) __obj.updateDynamic("toplevel")(toplevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UglifyJsOptions]
  }
}

