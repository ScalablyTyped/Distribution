package typings.uglifyDashJs.uglifyDashJsMod

import typings.uglifyDashJs.uglifyDashJsStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinifyOptions extends js.Object {
  var compress: js.UndefOr[Boolean | CompressOptions] = js.undefined
  var ie8: js.UndefOr[Boolean] = js.undefined
  var keep_fnames: js.UndefOr[Boolean] = js.undefined
  var mangle: js.UndefOr[Boolean | MangleOptions] = js.undefined
  var nameCache: js.UndefOr[js.Object] = js.undefined
  var output: js.UndefOr[OutputOptions] = js.undefined
  var parse: js.UndefOr[ParseOptions] = js.undefined
  var sourceMap: js.UndefOr[Boolean | SourceMapOptions] = js.undefined
  var toplevel: js.UndefOr[Boolean] = js.undefined
  /** Pass true to return compressor warnings in result.warnings. Use the value `verbose` for more detailed warnings. */
  var warnings: js.UndefOr[Boolean | verbose] = js.undefined
}

object MinifyOptions {
  @scala.inline
  def apply(
    compress: Boolean | CompressOptions = null,
    ie8: js.UndefOr[Boolean] = js.undefined,
    keep_fnames: js.UndefOr[Boolean] = js.undefined,
    mangle: Boolean | MangleOptions = null,
    nameCache: js.Object = null,
    output: OutputOptions = null,
    parse: ParseOptions = null,
    sourceMap: Boolean | SourceMapOptions = null,
    toplevel: js.UndefOr[Boolean] = js.undefined,
    warnings: Boolean | verbose = null
  ): MinifyOptions = {
    val __obj = js.Dynamic.literal()
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (!js.isUndefined(ie8)) __obj.updateDynamic("ie8")(ie8)
    if (!js.isUndefined(keep_fnames)) __obj.updateDynamic("keep_fnames")(keep_fnames)
    if (mangle != null) __obj.updateDynamic("mangle")(mangle.asInstanceOf[js.Any])
    if (nameCache != null) __obj.updateDynamic("nameCache")(nameCache)
    if (output != null) __obj.updateDynamic("output")(output)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(toplevel)) __obj.updateDynamic("toplevel")(toplevel)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinifyOptions]
  }
}

