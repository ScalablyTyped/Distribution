package typings.webpack.webpackMod.SourceMapDevToolPluginNs

import typings.webpack.Anon_Exclude
import typings.webpack.webpackMod.Condition
import typings.webpack.webpackNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @todo extend EvalSourceMapDevToolPlugin.Options */
trait Options extends js.Object {
  var append: js.UndefOr[`false` | String] = js.undefined
  var columns: js.UndefOr[Boolean] = js.undefined
  var exclude: js.UndefOr[Condition | js.Array[Condition]] = js.undefined
  var fallbackModuleFilenameTemplate: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[Null | `false` | String] = js.undefined
  var include: js.UndefOr[Condition | js.Array[Condition]] = js.undefined
  var lineToLine: js.UndefOr[Boolean | Anon_Exclude] = js.undefined
  var module: js.UndefOr[Boolean] = js.undefined
  var moduleFilenameTemplate: js.UndefOr[String] = js.undefined
  var noSources: js.UndefOr[Boolean] = js.undefined
  var publicPath: js.UndefOr[String] = js.undefined
  var sourceRoot: js.UndefOr[Null | String] = js.undefined
  var test: js.UndefOr[Condition | js.Array[Condition]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    append: `false` | String = null,
    columns: js.UndefOr[Boolean] = js.undefined,
    exclude: Condition | js.Array[Condition] = null,
    fallbackModuleFilenameTemplate: String = null,
    filename: `false` | String = null,
    include: Condition | js.Array[Condition] = null,
    lineToLine: Boolean | Anon_Exclude = null,
    module: js.UndefOr[Boolean] = js.undefined,
    moduleFilenameTemplate: String = null,
    noSources: js.UndefOr[Boolean] = js.undefined,
    publicPath: String = null,
    sourceRoot: String = null,
    test: Condition | js.Array[Condition] = null
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

