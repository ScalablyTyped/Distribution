package typings.terser.terserMod

import typings.std.RegExp
import typings.terser.terserStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinifyOptions extends js.Object {
  var compress: js.UndefOr[Boolean | CompressOptions] = js.undefined
  var ecma: js.UndefOr[ECMA] = js.undefined
  var ie8: js.UndefOr[Boolean] = js.undefined
  var keep_classnames: js.UndefOr[Boolean | RegExp] = js.undefined
  var keep_fnames: js.UndefOr[Boolean | RegExp] = js.undefined
  var mangle: js.UndefOr[Boolean | MangleOptions] = js.undefined
  var module: js.UndefOr[Boolean] = js.undefined
  var nameCache: js.UndefOr[js.Object] = js.undefined
  var output: js.UndefOr[OutputOptions] = js.undefined
  var parse: js.UndefOr[ParseOptions] = js.undefined
  var safari10: js.UndefOr[Boolean] = js.undefined
  var sourceMap: js.UndefOr[Boolean | SourceMapOptions] = js.undefined
  var toplevel: js.UndefOr[Boolean] = js.undefined
  var warnings: js.UndefOr[Boolean | verbose] = js.undefined
}

object MinifyOptions {
  @scala.inline
  def apply(
    compress: Boolean | CompressOptions = null,
    ecma: ECMA = null,
    ie8: js.UndefOr[Boolean] = js.undefined,
    keep_classnames: Boolean | RegExp = null,
    keep_fnames: Boolean | RegExp = null,
    mangle: Boolean | MangleOptions = null,
    module: js.UndefOr[Boolean] = js.undefined,
    nameCache: js.Object = null,
    output: OutputOptions = null,
    parse: ParseOptions = null,
    safari10: js.UndefOr[Boolean] = js.undefined,
    sourceMap: Boolean | SourceMapOptions = null,
    toplevel: js.UndefOr[Boolean] = js.undefined,
    warnings: Boolean | verbose = null
  ): MinifyOptions = {
    val __obj = js.Dynamic.literal()
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (ecma != null) __obj.updateDynamic("ecma")(ecma.asInstanceOf[js.Any])
    if (!js.isUndefined(ie8)) __obj.updateDynamic("ie8")(ie8.asInstanceOf[js.Any])
    if (keep_classnames != null) __obj.updateDynamic("keep_classnames")(keep_classnames.asInstanceOf[js.Any])
    if (keep_fnames != null) __obj.updateDynamic("keep_fnames")(keep_fnames.asInstanceOf[js.Any])
    if (mangle != null) __obj.updateDynamic("mangle")(mangle.asInstanceOf[js.Any])
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (nameCache != null) __obj.updateDynamic("nameCache")(nameCache.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (!js.isUndefined(safari10)) __obj.updateDynamic("safari10")(safari10.asInstanceOf[js.Any])
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(toplevel)) __obj.updateDynamic("toplevel")(toplevel.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinifyOptions]
  }
}

