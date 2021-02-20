package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ParenthesizedExpressionSyntax")
@js.native
class ParenthesizedExpressionSyntax protected ()
  extends typings.typescriptServices.TypeScript.ParenthesizedExpressionSyntax {
  def this(
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object ParenthesizedExpressionSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.ParenthesizedExpressionSyntax.create1")
  @js.native
  def create1(expression: IExpressionSyntax): typings.typescriptServices.TypeScript.ParenthesizedExpressionSyntax = js.native
}
