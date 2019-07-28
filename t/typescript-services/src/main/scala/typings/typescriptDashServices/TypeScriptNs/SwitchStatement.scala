package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SwitchStatement")
@js.native
class SwitchStatement protected () extends AST {
  def this(expression: AST, closeParenToken: ASTSpan, switchClauses: ISyntaxList2) = this()
  var closeParenToken: ASTSpan = js.native
  var expression: AST = js.native
  var switchClauses: ISyntaxList2 = js.native
  def structuralEquals(ast: SwitchStatement, includingPosition: Boolean): Boolean = js.native
}

