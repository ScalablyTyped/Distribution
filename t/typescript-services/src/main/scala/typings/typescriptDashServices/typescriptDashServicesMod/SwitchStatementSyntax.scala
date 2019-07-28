package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.IExpressionSyntax
import typings.typescriptDashServices.TypeScriptNs.ISyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SwitchStatementSyntax")
@js.native
class SwitchStatementSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.SwitchStatementSyntax {
  def this(
    switchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    switchClauses: ISyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SwitchStatementSyntax")
@js.native
object SwitchStatementSyntax extends js.Object {
  def create(
    switchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    closeBraceToken: ISyntaxToken
  ): typings.typescriptDashServices.TypeScriptNs.SwitchStatementSyntax = js.native
  def create1(expression: IExpressionSyntax): typings.typescriptDashServices.TypeScriptNs.SwitchStatementSyntax = js.native
}

