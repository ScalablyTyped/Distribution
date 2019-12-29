package typings.webpack.webpackMod.EvalSourceMapDevToolPlugin

import typings.webpack.Anon_Exclude
import typings.webpack.webpackBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var append: js.UndefOr[`false` | String] = js.undefined
  var columns: js.UndefOr[Boolean] = js.undefined
  var lineToLine: js.UndefOr[Boolean | Anon_Exclude] = js.undefined
  var module: js.UndefOr[Boolean] = js.undefined
  var moduleFilenameTemplate: js.UndefOr[String] = js.undefined
  var sourceRoot: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    append: `false` | String = null,
    columns: js.UndefOr[Boolean] = js.undefined,
    lineToLine: Boolean | Anon_Exclude = null,
    module: js.UndefOr[Boolean] = js.undefined,
    moduleFilenameTemplate: String = null,
    sourceRoot: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (append != null) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (lineToLine != null) __obj.updateDynamic("lineToLine")(lineToLine.asInstanceOf[js.Any])
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (moduleFilenameTemplate != null) __obj.updateDynamic("moduleFilenameTemplate")(moduleFilenameTemplate.asInstanceOf[js.Any])
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

