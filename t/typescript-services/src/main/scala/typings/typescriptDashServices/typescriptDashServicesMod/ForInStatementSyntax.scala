package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.IExpressionSyntax
import typings.typescriptDashServices.TypeScriptNs.IStatementSyntax
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ForInStatementSyntax")
@js.native
class ForInStatementSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.ForInStatementSyntax {
  def this(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: typings.typescriptDashServices.TypeScriptNs.VariableDeclarationSyntax,
    left: IExpressionSyntax,
    inKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ForInStatementSyntax")
@js.native
object ForInStatementSyntax extends js.Object {
  def create(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    inKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): typings.typescriptDashServices.TypeScriptNs.ForInStatementSyntax = js.native
  def create1(expression: IExpressionSyntax, statement: IStatementSyntax): typings.typescriptDashServices.TypeScriptNs.ForInStatementSyntax = js.native
}

