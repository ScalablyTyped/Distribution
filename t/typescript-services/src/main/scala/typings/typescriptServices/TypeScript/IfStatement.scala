package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.IfStatement")
@js.native
class IfStatement protected () extends AST {
  def this(condition: AST, statement: AST, elseClause: ElseClause) = this()
  var condition: AST = js.native
  var elseClause: ElseClause = js.native
  var statement: AST = js.native
  def structuralEquals(ast: IfStatement, includingPosition: Boolean): Boolean = js.native
}

