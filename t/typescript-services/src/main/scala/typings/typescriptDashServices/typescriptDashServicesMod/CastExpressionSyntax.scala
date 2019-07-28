package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import typings.typescriptDashServices.TypeScriptNs.ITypeSyntax
import typings.typescriptDashServices.TypeScriptNs.IUnaryExpressionSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "CastExpressionSyntax")
@js.native
class CastExpressionSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.CastExpressionSyntax {
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
  def create1(`type`: ITypeSyntax, expression: IUnaryExpressionSyntax): typings.typescriptDashServices.TypeScriptNs.CastExpressionSyntax = js.native
}

