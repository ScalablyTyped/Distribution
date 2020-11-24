package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ITypeSyntax
import typings.typescriptServices.TypeScript.IUnaryExpressionSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.CastExpressionSyntax")
@js.native
class CastExpressionSyntax protected ()
  extends typings.typescriptServices.TypeScript.CastExpressionSyntax {
  def this(
    lessThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    greaterThanToken: ISyntaxToken,
    expression: IUnaryExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.CastExpressionSyntax")
@js.native
object CastExpressionSyntax extends js.Object {
  
  def create1(`type`: ITypeSyntax, expression: IUnaryExpressionSyntax): typings.typescriptServices.TypeScript.CastExpressionSyntax = js.native
}
