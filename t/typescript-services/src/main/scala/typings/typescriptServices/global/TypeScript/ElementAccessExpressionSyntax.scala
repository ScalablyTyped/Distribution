package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ElementAccessExpressionSyntax")
@js.native
class ElementAccessExpressionSyntax protected ()
  extends typings.typescriptServices.TypeScript.ElementAccessExpressionSyntax {
  def this(
    expression: IExpressionSyntax,
    openBracketToken: ISyntaxToken,
    argumentExpression: IExpressionSyntax,
    closeBracketToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object ElementAccessExpressionSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.ElementAccessExpressionSyntax.create1")
  @js.native
  def create1(expression: IExpressionSyntax, argumentExpression: IExpressionSyntax): typings.typescriptServices.TypeScript.ElementAccessExpressionSyntax = js.native
}
