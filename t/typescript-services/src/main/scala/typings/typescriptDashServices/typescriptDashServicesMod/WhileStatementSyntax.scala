package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.IExpressionSyntax
import typings.typescriptDashServices.TypeScript.IStatementSyntax
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "WhileStatementSyntax")
@js.native
class WhileStatementSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.WhileStatementSyntax {
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
  def create1(condition: IExpressionSyntax, statement: IStatementSyntax): typings.typescriptDashServices.TypeScript.WhileStatementSyntax = js.native
}

