package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.CatchClause")
@js.native
class CatchClause protected () extends AST {
  def this(identifier: Identifier, typeAnnotation: TypeAnnotation, block: Block) = this()
  var block: Block = js.native
  var identifier: Identifier = js.native
  var typeAnnotation: TypeAnnotation = js.native
  def structuralEquals(ast: CatchClause, includingPosition: Boolean): Boolean = js.native
}

