package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ExpressionStatement")
@js.native
class ExpressionStatement protected () extends AST {
  def this(expression: AST) = this()
  var expression: AST = js.native
  def structuralEquals(ast: ExpressionStatement, includingPosition: Boolean): Boolean = js.native
}

