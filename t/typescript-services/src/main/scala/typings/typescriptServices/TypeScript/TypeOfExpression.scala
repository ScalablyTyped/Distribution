package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeOfExpression")
@js.native
class TypeOfExpression protected () extends AST {
  def this(expression: AST) = this()
  var expression: AST = js.native
  def structuralEquals(ast: TypeOfExpression, includingPosition: Boolean): Boolean = js.native
}

