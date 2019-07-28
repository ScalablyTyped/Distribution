package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.IExpressionSyntax
import typings.typescriptDashServices.TypeScriptNs.IStatementSyntax
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ForStatementSyntax")
@js.native
class ForStatementSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.ForStatementSyntax {
  def this(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: typings.typescriptDashServices.TypeScriptNs.VariableDeclarationSyntax,
    initializer: IExpressionSyntax,
    firstSemicolonToken: ISyntaxToken,
    condition: IExpressionSyntax,
    secondSemicolonToken: ISyntaxToken,
    incrementor: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ForStatementSyntax")
@js.native
object ForStatementSyntax extends js.Object {
  def create(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    firstSemicolonToken: ISyntaxToken,
    secondSemicolonToken: ISyntaxToken,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): typings.typescriptDashServices.TypeScriptNs.ForStatementSyntax = js.native
  def create1(statement: IStatementSyntax): typings.typescriptDashServices.TypeScriptNs.ForStatementSyntax = js.native
}

