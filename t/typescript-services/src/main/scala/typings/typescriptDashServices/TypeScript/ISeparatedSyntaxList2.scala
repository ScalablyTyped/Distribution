package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ISeparatedSyntaxList2")
@js.native
class ISeparatedSyntaxList2 protected () extends AST {
  def this(_fileName: String, members: js.Array[AST], _separatorCount: Double) = this()
  var _fileName: js.Any = js.native
  var _separatorCount: js.Any = js.native
  var members: js.Any = js.native
  def nonSeparatorAt(index: Double): AST = js.native
  def nonSeparatorCount(): Double = js.native
  def nonSeparatorIndexOf(ast: AST): Double = js.native
  def separatorCount(): Double = js.native
  def structuralEquals(ast: ISeparatedSyntaxList2, includingPosition: Boolean): Boolean = js.native
}

