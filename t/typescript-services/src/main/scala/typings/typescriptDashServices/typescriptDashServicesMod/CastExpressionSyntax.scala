package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxToken
import typings.typescriptDashServices.TypeScript.ITypeSyntax
import typings.typescriptDashServices.TypeScript.IUnaryExpressionSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "CastExpressionSyntax")
@js.native
class CastExpressionSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.CastExpressionSyntax {
  def this(
    lessThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    greaterThanToken: ISyntaxToken,
    expression: IUnaryExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "CastExpressionSyntax")
@js.native
object CastExpressionSyntax extends js.Object {
  def create1(`type`: ITypeSyntax, expression: IUnaryExpressionSyntax): typings.typescriptDashServices.TypeScript.CastExpressionSyntax = js.native
}

