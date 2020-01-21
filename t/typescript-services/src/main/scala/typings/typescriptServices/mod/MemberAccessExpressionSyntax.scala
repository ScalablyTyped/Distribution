package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "MemberAccessExpressionSyntax")
@js.native
class MemberAccessExpressionSyntax protected ()
  extends typings.typescriptServices.TypeScript.MemberAccessExpressionSyntax {
  def this(
    expression: IExpressionSyntax,
    dotToken: ISyntaxToken,
    name: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "MemberAccessExpressionSyntax")
@js.native
object MemberAccessExpressionSyntax extends js.Object {
  def create1(expression: IExpressionSyntax, name: ISyntaxToken): typings.typescriptServices.TypeScript.MemberAccessExpressionSyntax = js.native
}

