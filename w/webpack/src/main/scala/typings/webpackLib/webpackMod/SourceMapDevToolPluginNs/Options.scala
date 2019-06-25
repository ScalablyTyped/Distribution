package typings
package webpackLib.webpackMod.SourceMapDevToolPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @todo extend EvalSourceMapDevToolPlugin.Options */
trait Options extends js.Object {
  var append: js.UndefOr[webpackLib.webpackLibNumbers.`false` | java.lang.String] = js.undefined
  var columns: js.UndefOr[scala.Boolean] = js.undefined
  var exclude: js.UndefOr[webpackLib.webpackMod.Condition | js.Array[webpackLib.webpackMod.Condition]] = js.undefined
  var fallbackModuleFilenameTemplate: js.UndefOr[java.lang.String] = js.undefined
  var filename: js.UndefOr[scala.Null | webpackLib.webpackLibNumbers.`false` | java.lang.String] = js.undefined
  var include: js.UndefOr[webpackLib.webpackMod.Condition | js.Array[webpackLib.webpackMod.Condition]] = js.undefined
  var lineToLine: js.UndefOr[scala.Boolean | webpackLib.Anon_Exclude] = js.undefined
  var module: js.UndefOr[scala.Boolean] = js.undefined
  var moduleFilenameTemplate: js.UndefOr[java.lang.String] = js.undefined
  var noSources: js.UndefOr[scala.Boolean] = js.undefined
  var publicPath: js.UndefOr[java.lang.String] = js.undefined
  var sourceRoot: js.UndefOr[scala.Null | java.lang.String] = js.undefined
  var test: js.UndefOr[webpackLib.webpackMod.Condition | js.Array[webpackLib.webpackMod.Condition]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    append: webpackLib.webpackLibNumbers.`false` | java.lang.String = null,
    columns: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: webpackLib.webpackMod.Condition | js.Array[webpackLib.webpackMod.Condition] = null,
    fallbackModuleFilenameTemplate: java.lang.String = null,
    filename: webpackLib.webpackLibNumbers.`false` | java.lang.String = null,
    include: webpackLib.webpackMod.Condition | js.Array[webpackLib.webpackMod.Condition] = null,
    lineToLine: scala.Boolean | webpackLib.Anon_Exclude = null,
    module: js.UndefOr[scala.Boolean] = js.undefined,
    moduleFilenameTemplate: java.lang.String = null,
    noSources: js.UndefOr[scala.Boolean] = js.undefined,
    publicPath: java.lang.String = null,
    sourceRoot: java.lang.String = null,
    test: webpackLib.webpackMod.Condition | js.Array[webpackLib.webpackMod.Condition] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (append != null) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (fallbackModuleFilenameTemplate != null) __obj.updateDynamic("fallbackModuleFilenameTemplate")(fallbackModuleFilenameTemplate)
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (lineToLine != null) __obj.updateDynamic("lineToLine")(lineToLine.asInstanceOf[js.Any])
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module)
    if (moduleFilenameTemplate != null) __obj.updateDynamic("moduleFilenameTemplate")(moduleFilenameTemplate)
    if (!js.isUndefined(noSources)) __obj.updateDynamic("noSources")(noSources)
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

