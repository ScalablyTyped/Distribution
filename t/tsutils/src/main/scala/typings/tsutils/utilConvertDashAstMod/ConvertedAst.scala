package typings.tsutils.utilConvertDashAstMod

import typings.typescript.typescriptMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvertedAst extends js.Object {
  var flat: js.Array[Node]
  var wrapped: WrappedAst
}

object ConvertedAst {
  @scala.inline
  def apply(flat: js.Array[Node], wrapped: WrappedAst): ConvertedAst = {
    val __obj = js.Dynamic.literal(flat = flat, wrapped = wrapped)
  
    __obj.asInstanceOf[ConvertedAst]
  }
}

