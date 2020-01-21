package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeParameter")
@js.native
class TypeParameter protected () extends AST {
  def this(identifier: Identifier, constraint: Constraint) = this()
  var constraint: Constraint = js.native
  var identifier: Identifier = js.native
  def structuralEquals(ast: TypeParameter, includingPosition: Boolean): Boolean = js.native
}

