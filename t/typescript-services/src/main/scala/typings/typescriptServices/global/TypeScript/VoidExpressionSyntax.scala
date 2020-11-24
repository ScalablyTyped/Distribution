package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.IUnaryExpressionSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.VoidExpressionSyntax")
@js.native
class VoidExpressionSyntax protected ()
  extends typings.typescriptServices.TypeScript.VoidExpressionSyntax {
  def this(voidKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax, parsedInStrictMode: Boolean) = this()
}
/* static members */
@JSGlobal("TypeScript.VoidExpressionSyntax")
@js.native
object VoidExpressionSyntax extends js.Object {
  
  def create1(expression: IUnaryExpressionSyntax): typings.typescriptServices.TypeScript.VoidExpressionSyntax = js.native
}
