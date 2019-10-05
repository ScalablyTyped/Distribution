package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.IExpressionSyntax
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ParenthesizedExpressionSyntax")
@js.native
class ParenthesizedExpressionSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.ParenthesizedExpressionSyntax {
  def this(
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ParenthesizedExpressionSyntax")
@js.native
object ParenthesizedExpressionSyntax extends js.Object {
  def create1(expression: IExpressionSyntax): typings.typescriptDashServices.TypeScript.ParenthesizedExpressionSyntax = js.native
}

