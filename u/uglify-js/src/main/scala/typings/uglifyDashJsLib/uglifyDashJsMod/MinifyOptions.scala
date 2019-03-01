package typings
package uglifyDashJsLib.uglifyDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinifyOptions extends js.Object {
  var compress: js.UndefOr[scala.Boolean | CompressOptions] = js.undefined
  var ie8: js.UndefOr[scala.Boolean] = js.undefined
  var keep_fnames: js.UndefOr[scala.Boolean] = js.undefined
  var mangle: js.UndefOr[scala.Boolean | MangleOptions] = js.undefined
  var nameCache: js.UndefOr[js.Object] = js.undefined
  var output: js.UndefOr[OutputOptions] = js.undefined
  var parse: js.UndefOr[ParseOptions] = js.undefined
  var sourceMap: js.UndefOr[scala.Boolean | SourceMapOptions] = js.undefined
  var toplevel: js.UndefOr[scala.Boolean] = js.undefined
  /** Pass true to return compressor warnings in result.warnings. Use the value `verbose` for more detailed warnings. */
  var warnings: js.UndefOr[scala.Boolean | uglifyDashJsLib.uglifyDashJsLibStrings.verbose] = js.undefined
}

object MinifyOptions {
  @scala.inline
  def apply(
    compress: scala.Boolean | CompressOptions = null,
    ie8: js.UndefOr[scala.Boolean] = js.undefined,
    keep_fnames: js.UndefOr[scala.Boolean] = js.undefined,
    mangle: scala.Boolean | MangleOptions = null,
    nameCache: js.Object = null,
    output: OutputOptions = null,
    parse: ParseOptions = null,
    sourceMap: scala.Boolean | SourceMapOptions = null,
    toplevel: js.UndefOr[scala.Boolean] = js.undefined,
    warnings: scala.Boolean | uglifyDashJsLib.uglifyDashJsLibStrings.verbose = null
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

