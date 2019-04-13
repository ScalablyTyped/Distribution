package typings
package webpackLib.webpackMod.EvalSourceMapDevToolPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var append: js.UndefOr[webpackLib.webpackLibNumbers.`false` | java.lang.String] = js.undefined
  var columns: js.UndefOr[scala.Boolean] = js.undefined
  var lineToLine: js.UndefOr[scala.Boolean | webpackLib.Anon_Exclude] = js.undefined
  var module: js.UndefOr[scala.Boolean] = js.undefined
  var moduleFilenameTemplate: js.UndefOr[java.lang.String] = js.undefined
  var sourceRoot: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    append: webpackLib.webpackLibNumbers.`false` | java.lang.String = null,
    columns: js.UndefOr[scala.Boolean] = js.undefined,
    lineToLine: scala.Boolean | webpackLib.Anon_Exclude = null,
    module: js.UndefOr[scala.Boolean] = js.undefined,
    moduleFilenameTemplate: java.lang.String = null,
    sourceRoot: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (append != null) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns)
    if (lineToLine != null) __obj.updateDynamic("lineToLine")(lineToLine.asInstanceOf[js.Any])
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module)
    if (moduleFilenameTemplate != null) __obj.updateDynamic("moduleFilenameTemplate")(moduleFilenameTemplate)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    __obj.asInstanceOf[Options]
  }
}

