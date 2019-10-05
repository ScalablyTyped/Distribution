package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ObjectLiteralExpressionSyntax")
@js.native
class ObjectLiteralExpressionSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.ObjectLiteralExpressionSyntax {
  def this(
    openBraceToken: ISyntaxToken,
    propertyAssignments: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ObjectLiteralExpressionSyntax")
@js.native
object ObjectLiteralExpressionSyntax extends js.Object {
  def create(openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): typings.typescriptDashServices.TypeScript.ObjectLiteralExpressionSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScript.ObjectLiteralExpressionSyntax = js.native
}

