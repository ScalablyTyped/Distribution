package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.WhileStatement")
@js.native
class WhileStatement protected () extends AST {
  def this(condition: AST, statement: AST) = this()
  var condition: AST = js.native
  var statement: AST = js.native
  def structuralEquals(ast: WhileStatement, includingPosition: Boolean): Boolean = js.native
}

