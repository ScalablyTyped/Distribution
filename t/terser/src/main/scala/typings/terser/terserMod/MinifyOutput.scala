package typings.terser.terserMod

import typings.sourceDashMap.sourceDashMapMod.RawSourceMap
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinifyOutput extends js.Object {
  var ast: js.UndefOr[AST_Node] = js.undefined
  var code: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[Error] = js.undefined
  var map: js.UndefOr[RawSourceMap | String] = js.undefined
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}

object MinifyOutput {
  @scala.inline
  def apply(
    ast: AST_Node = null,
    code: String = null,
    error: Error = null,
    map: RawSourceMap | String = null,
    warnings: js.Array[String] = null
  ): MinifyOutput = {
    val __obj = js.Dynamic.literal()
    if (ast != null) __obj.updateDynamic("ast")(ast.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinifyOutput]
  }
}

