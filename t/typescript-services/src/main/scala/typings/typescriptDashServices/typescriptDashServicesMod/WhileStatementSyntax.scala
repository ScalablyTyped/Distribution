package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.IExpressionSyntax
import typings.typescriptDashServices.TypeScriptNs.IStatementSyntax
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "WhileStatementSyntax")
@js.native
class WhileStatementSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.WhileStatementSyntax {
  def this(
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "WhileStatementSyntax")
@js.native
object WhileStatementSyntax extends js.Object {
  def create1(condition: IExpressionSyntax, statement: IStatementSyntax): typings.typescriptDashServices.TypeScriptNs.WhileStatementSyntax = js.native
}

