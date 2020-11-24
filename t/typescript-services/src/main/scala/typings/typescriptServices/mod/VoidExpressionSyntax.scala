package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.IUnaryExpressionSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "VoidExpressionSyntax")
@js.native
class VoidExpressionSyntax protected ()
  extends typings.typescriptServices.TypeScript.VoidExpressionSyntax {
  def this(voidKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax, parsedInStrictMode: Boolean) = this()
}
/* static members */
@JSImport("typescript-services", "VoidExpressionSyntax")
@js.native
object VoidExpressionSyntax extends js.Object {
  
  def create1(expression: IUnaryExpressionSyntax): typings.typescriptServices.TypeScript.VoidExpressionSyntax = js.native
}
