package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.IExpressionSyntax
import typings.typescriptDashServices.TypeScript.IStatementSyntax
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "IfStatementSyntax")
@js.native
class IfStatementSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.IfStatementSyntax {
  def this(
    ifKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    elseClause: typings.typescriptDashServices.TypeScript.ElseClauseSyntax,
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
  ): typings.typescriptDashServices.TypeScript.IfStatementSyntax = js.native
  def create1(condition: IExpressionSyntax, statement: IStatementSyntax): typings.typescriptDashServices.TypeScript.IfStatementSyntax = js.native
}

