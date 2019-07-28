package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.QualifiedName")
@js.native
class QualifiedName protected () extends AST {
  def this(left: AST, right: Identifier) = this()
  var left: AST = js.native
  var right: Identifier = js.native
  def structuralEquals(ast: QualifiedName, includingPosition: Boolean): Boolean = js.native
}

