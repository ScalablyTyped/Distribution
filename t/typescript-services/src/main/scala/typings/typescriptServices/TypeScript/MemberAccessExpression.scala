package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.MemberAccessExpression")
@js.native
class MemberAccessExpression protected () extends AST {
  def this(expression: AST, name: Identifier) = this()
  var expression: AST = js.native
  var name: Identifier = js.native
  def structuralEquals(ast: MemberAccessExpression, includingPosition: Boolean): Boolean = js.native
}

