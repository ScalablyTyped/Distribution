package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.DoStatement")
@js.native
class DoStatement protected () extends AST {
  def this(statement: AST, whileKeyword: ASTSpan, condition: AST) = this()
  var condition: AST = js.native
  var statement: AST = js.native
  var whileKeyword: ASTSpan = js.native
  def structuralEquals(ast: DoStatement, includingPosition: Boolean): Boolean = js.native
}

