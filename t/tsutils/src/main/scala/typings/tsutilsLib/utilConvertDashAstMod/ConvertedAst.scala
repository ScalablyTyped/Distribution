package typings
package tsutilsLib.utilConvertDashAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvertedAst extends js.Object {
  var flat: js.Array[typescriptLib.typescriptMod.tsNs.Node]
  var wrapped: WrappedAst
}

object ConvertedAst {
  @scala.inline
  def apply(flat: js.Array[typescriptLib.typescriptMod.tsNs.Node], wrapped: WrappedAst): ConvertedAst = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flat")(flat)
    __obj.updateDynamic("wrapped")(wrapped)
    __obj.asInstanceOf[ConvertedAst]
  }
}

