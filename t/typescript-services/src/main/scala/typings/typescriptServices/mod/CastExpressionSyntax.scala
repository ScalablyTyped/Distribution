package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ITypeSyntax
import typings.typescriptServices.TypeScript.IUnaryExpressionSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "CastExpressionSyntax")
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
object CastExpressionSyntax {
  
  /* static member */
  @JSImport("typescript-services", "CastExpressionSyntax.create1")
  @js.native
  def create1(`type`: ITypeSyntax, expression: IUnaryExpressionSyntax): typings.typescriptServices.TypeScript.CastExpressionSyntax = js.native
}
