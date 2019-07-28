package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.IExpressionSyntax
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ReturnStatementSyntax")
@js.native
class ReturnStatementSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.ReturnStatementSyntax {
  def this(
    returnKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ReturnStatementSyntax")
@js.native
object ReturnStatementSyntax extends js.Object {
  def create(returnKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typings.typescriptDashServices.TypeScriptNs.ReturnStatementSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScriptNs.ReturnStatementSyntax = js.native
}

