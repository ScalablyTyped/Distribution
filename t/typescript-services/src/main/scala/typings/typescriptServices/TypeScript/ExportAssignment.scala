package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ExportAssignment")
@js.native
class ExportAssignment protected () extends AST {
  def this(identifier: Identifier) = this()
  var identifier: Identifier = js.native
  def structuralEquals(ast: ExportAssignment, includingPosition: Boolean): Boolean = js.native
}

