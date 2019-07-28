package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.IExpressionSyntax
import typings.typescriptDashServices.TypeScriptNs.IStatementSyntax
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "DoStatementSyntax")
@js.native
class DoStatementSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.DoStatementSyntax {
  def this(
    doKeyword: ISyntaxToken,
    statement: IStatementSyntax,
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "DoStatementSyntax")
@js.native
object DoStatementSyntax extends js.Object {
  def create1(statement: IStatementSyntax, condition: IExpressionSyntax): typings.typescriptDashServices.TypeScriptNs.DoStatementSyntax = js.native
}

