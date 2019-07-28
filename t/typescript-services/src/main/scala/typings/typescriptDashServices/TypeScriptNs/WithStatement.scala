package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.WithStatement")
@js.native
class WithStatement protected () extends AST {
  def this(condition: AST, statement: AST) = this()
  var condition: AST = js.native
  var statement: AST = js.native
  def structuralEquals(ast: WithStatement, includingPosition: Boolean): Boolean = js.native
}

