package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.VariableStatement")
@js.native
class VariableStatement protected () extends AST {
  def this(modifiers: js.Array[PullElementFlags], declaration: VariableDeclaration) = this()
  var declaration: VariableDeclaration = js.native
  var modifiers: js.Array[PullElementFlags] = js.native
  def structuralEquals(ast: VariableStatement, includingPosition: Boolean): Boolean = js.native
}

