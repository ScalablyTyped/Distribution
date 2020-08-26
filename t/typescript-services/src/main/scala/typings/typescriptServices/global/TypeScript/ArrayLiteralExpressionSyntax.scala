package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ArrayLiteralExpressionSyntax")
@js.native
class ArrayLiteralExpressionSyntax protected ()
  extends typings.typescriptServices.TypeScript.ArrayLiteralExpressionSyntax {
  def this(
    openBracketToken: ISyntaxToken,
    expressions: ISeparatedSyntaxList,
    closeBracketToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.ArrayLiteralExpressionSyntax")
@js.native
object ArrayLiteralExpressionSyntax extends js.Object {
  def create(openBracketToken: ISyntaxToken, closeBracketToken: ISyntaxToken): typings.typescriptServices.TypeScript.ArrayLiteralExpressionSyntax = js.native
  def create1(): typings.typescriptServices.TypeScript.ArrayLiteralExpressionSyntax = js.native
}

