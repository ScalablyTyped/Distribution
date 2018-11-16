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
  var parallel: js.UndefOr[scala.Boolean | webpackLib.Anon_Workers] = js.undefined
  @JSName("sourceMap")
  var sourceMap_Options: js.UndefOr[scala.Boolean] = js.undefined
  var test: js.UndefOr[
    webpackLib.webpackMod.webpackNs.Condition | js.Array[webpackLib.webpackMod.webpackNs.Condition]
  ] = js.undefined
}

