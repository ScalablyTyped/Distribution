package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.BreakStatement")
@js.native
class BreakStatement protected () extends AST {
  def this(identifier: Identifier) = this()
  var identifier: Identifier = js.native
  def structuralEquals(ast: BreakStatement, includingPosition: Boolean): Boolean = js.native
}

