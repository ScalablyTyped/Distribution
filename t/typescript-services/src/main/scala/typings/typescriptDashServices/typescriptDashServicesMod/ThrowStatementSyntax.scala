package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.IExpressionSyntax
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ThrowStatementSyntax")
@js.native
class ThrowStatementSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.ThrowStatementSyntax {
  def this(
    throwKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ThrowStatementSyntax")
@js.native
object ThrowStatementSyntax extends js.Object {
  def create1(expression: IExpressionSyntax): typings.typescriptDashServices.TypeScriptNs.ThrowStatementSyntax = js.native
}

