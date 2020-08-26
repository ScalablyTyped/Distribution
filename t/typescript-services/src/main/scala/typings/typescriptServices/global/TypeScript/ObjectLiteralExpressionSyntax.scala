package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ObjectLiteralExpressionSyntax")
@js.native
class ObjectLiteralExpressionSyntax protected ()
  extends typings.typescriptServices.TypeScript.ObjectLiteralExpressionSyntax {
  def this(
    openBraceToken: ISyntaxToken,
    propertyAssignments: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.ObjectLiteralExpressionSyntax")
@js.native
object ObjectLiteralExpressionSyntax extends js.Object {
  def create(openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): typings.typescriptServices.TypeScript.ObjectLiteralExpressionSyntax = js.native
  def create1(): typings.typescriptServices.TypeScript.ObjectLiteralExpressionSyntax = js.native
}

