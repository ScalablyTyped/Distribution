package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IMemberExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ObjectCreationExpressionSyntax")
@js.native
class ObjectCreationExpressionSyntax protected ()
  extends typings.typescriptServices.TypeScript.ObjectCreationExpressionSyntax {
  def this(
    newKeyword: ISyntaxToken,
    expression: IMemberExpressionSyntax,
    argumentList: typings.typescriptServices.TypeScript.ArgumentListSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.ObjectCreationExpressionSyntax")
@js.native
object ObjectCreationExpressionSyntax extends js.Object {
  def create(newKeyword: ISyntaxToken, expression: IMemberExpressionSyntax): typings.typescriptServices.TypeScript.ObjectCreationExpressionSyntax = js.native
  def create1(expression: IMemberExpressionSyntax): typings.typescriptServices.TypeScript.ObjectCreationExpressionSyntax = js.native
}

