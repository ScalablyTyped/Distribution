package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ReturnStatement")
@js.native
class ReturnStatement protected () extends AST {
  def this(expression: AST) = this()
  var expression: AST = js.native
  def structuralEquals(ast: ReturnStatement, includingPosition: Boolean): Boolean = js.native
}

