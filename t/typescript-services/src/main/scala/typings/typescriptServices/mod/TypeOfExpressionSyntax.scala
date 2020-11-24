package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.IUnaryExpressionSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "TypeOfExpressionSyntax")
@js.native
class TypeOfExpressionSyntax protected ()
  extends typings.typescriptServices.TypeScript.TypeOfExpressionSyntax {
  def this(typeOfKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax, parsedInStrictMode: Boolean) = this()
}
/* static members */
@JSImport("typescript-services", "TypeOfExpressionSyntax")
@js.native
object TypeOfExpressionSyntax extends js.Object {
  
  def create1(expression: IUnaryExpressionSyntax): typings.typescriptServices.TypeScript.TypeOfExpressionSyntax = js.native
}
