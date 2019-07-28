package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.IExpressionSyntax
import typings.typescriptDashServices.TypeScriptNs.IStatementSyntax
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "IfStatementSyntax")
@js.native
class IfStatementSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.IfStatementSyntax {
  def this(
    ifKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    elseClause: typings.typescriptDashServices.TypeScriptNs.ElseClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "IfStatementSyntax")
@js.native
object IfStatementSyntax extends js.Object {
  def create(
    ifKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): typings.typescriptDashServices.TypeScriptNs.IfStatementSyntax = js.native
  def create1(condition: IExpressionSyntax, statement: IStatementSyntax): typings.typescriptDashServices.TypeScriptNs.IfStatementSyntax = js.native
}

