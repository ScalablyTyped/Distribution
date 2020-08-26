package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IMemberExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ObjectCreationExpressionSyntax")
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
@JSImport("typescript-services", "ObjectCreationExpressionSyntax")
@js.native
object ObjectCreationExpressionSyntax extends js.Object {
  def create(newKeyword: ISyntaxToken, expression: IMemberExpressionSyntax): typings.typescriptServices.TypeScript.ObjectCreationExpressionSyntax = js.native
  def create1(expression: IMemberExpressionSyntax): typings.typescriptServices.TypeScript.ObjectCreationExpressionSyntax = js.native
}

