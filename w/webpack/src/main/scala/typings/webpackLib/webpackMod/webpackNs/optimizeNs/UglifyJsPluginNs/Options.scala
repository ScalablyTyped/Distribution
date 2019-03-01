package typings
package webpackLib.webpackMod.webpackNs.optimizeNs.UglifyJsPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends uglifyDashJsLib.uglifyDashJsMod.MinifyOptions {
  var beautify: js.UndefOr[scala.Boolean] = js.undefined
  var comments: js.UndefOr[scala.Boolean | stdLib.RegExp | CommentFilter] = js.undefined
  var exclude: js.UndefOr[
    webpackLib.webpackMod.webpackNs.Condition | js.Array[webpackLib.webpackMod.webpackNs.Condition]
  ] = js.undefined
  var include: js.UndefOr[
    webpackLib.webpackMod.webpackNs.Condition | js.Array[webpackLib.webpackMod.webpackNs.Condition]
  ] = js.undefined
  /** Parallelization can speedup your build significantly and is therefore highly recommended. */
  var parallel: js.UndefOr[scala.Boolean | webpackLib.Anon_Cache] = js.undefined
  @JSName("sourceMap")
  var sourceMap_Options: js.UndefOr[scala.Boolean] = js.undefined
  var test: js.UndefOr[
    webpackLib.webpackMod.webpackNs.Condition | js.Array[webpackLib.webpackMod.webpackNs.Condition]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    beautify: js.UndefOr[scala.Boolean] = js.undefined,
    comments: scala.Boolean | stdLib.RegExp | CommentFilter = null,
    compress: scala.Boolean | uglifyDashJsLib.uglifyDashJsMod.CompressOptions = null,
    exclude: webpackLib.webpackMod.webpackNs.Condition | js.Array[webpackLib.webpackMod.webpackNs.Condition] = null,
    ie8: js.UndefOr[scala.Boolean] = js.undefined,
    include: webpackLib.webpackMod.webpackNs.Condition | js.Array[webpackLib.webpackMod.webpackNs.Condition] = null,
    keep_fnames: js.UndefOr[scala.Boolean] = js.undefined,
    mangle: scala.Boolean | uglifyDashJsLib.uglifyDashJsMod.MangleOptions = null,
    nameCache: js.Object = null,
    output: uglifyDashJsLib.uglifyDashJsMod.OutputOptions = null,
    parallel: scala.Boolean | webpackLib.Anon_Cache = null,
    parse: uglifyDashJsLib.uglifyDashJsMod.ParseOptions = null,
    sourceMap: js.UndefOr[scala.Boolean] = js.undefined,
    test: webpackLib.webpackMod.webpackNs.Condition | js.Array[webpackLib.webpackMod.webpackNs.Condition] = null,
    toplevel: js.UndefOr[scala.Boolean] = js.undefined,
    warnings: scala.Boolean | uglifyDashJsLib.uglifyDashJsLibStrings.verbose = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(beautify)) __obj.updateDynamic("beautify")(beautify)
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(ie8)) __obj.updateDynamic("ie8")(ie8)
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_fnames)) __obj.updateDynamic("keep_fnames")(keep_fnames)
    if (mangle != null) __obj.updateDynamic("mangle")(mangle.asInstanceOf[js.Any])
    if (nameCache != null) __obj.updateDynamic("nameCache")(nameCache)
    if (output != null) __obj.updateDynamic("output")(output)
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap)
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (!js.isUndefined(toplevel)) __obj.updateDynamic("toplevel")(toplevel)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

