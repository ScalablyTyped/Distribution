package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinifyOutput extends js.Object {
  var ast: js.UndefOr[AST_Node] = js.undefined
  var code: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[nodeLib.Error] = js.undefined
  var map: js.UndefOr[java.lang.String] = js.undefined
  var warnings: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object MinifyOutput {
  @scala.inline
  def apply(
    ast: AST_Node = null,
    code: java.lang.String = null,
    error: nodeLib.Error = null,
    map: java.lang.String = null,
    warnings: js.Array[java.lang.String] = null
  ): MinifyOutput = {
    val __obj = js.Dynamic.literal()
    if (ast != null) __obj.updateDynamic("ast")(ast)
    if (code != null) __obj.updateDynamic("code")(code)
    if (error != null) __obj.updateDynamic("error")(error)
    if (map != null) __obj.updateDynamic("map")(map)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[MinifyOutput]
  }
}

