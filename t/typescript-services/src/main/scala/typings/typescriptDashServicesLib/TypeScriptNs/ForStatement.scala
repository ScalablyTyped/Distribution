package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ForStatement")
@js.native
class ForStatement protected () extends AST {
  def this(variableDeclaration: VariableDeclaration, initializer: AST, condition: AST, incrementor: AST, statement: AST) = this()
  var condition: AST = js.native
  var incrementor: AST = js.native
  var initializer: AST = js.native
  var statement: AST = js.native
  var variableDeclaration: VariableDeclaration = js.native
  def structuralEquals(ast: ForStatement, includingPosition: scala.Boolean): scala.Boolean = js.native
}

