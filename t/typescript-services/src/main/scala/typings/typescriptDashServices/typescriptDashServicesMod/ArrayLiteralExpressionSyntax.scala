package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ArrayLiteralExpressionSyntax")
@js.native
class ArrayLiteralExpressionSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.ArrayLiteralExpressionSyntax {
  def this(
    openBracketToken: ISyntaxToken,
    expressions: ISeparatedSyntaxList,
    closeBracketToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ArrayLiteralExpressionSyntax")
@js.native
object ArrayLiteralExpressionSyntax extends js.Object {
  def create(openBracketToken: ISyntaxToken, closeBracketToken: ISyntaxToken): typings.typescriptDashServices.TypeScript.ArrayLiteralExpressionSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScript.ArrayLiteralExpressionSyntax = js.native
}

