package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.IExpressionSyntax
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ThrowStatementSyntax")
@js.native
class ThrowStatementSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.ThrowStatementSyntax {
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
  def create1(expression: IExpressionSyntax): typings.typescriptDashServices.TypeScript.ThrowStatementSyntax = js.native
}

