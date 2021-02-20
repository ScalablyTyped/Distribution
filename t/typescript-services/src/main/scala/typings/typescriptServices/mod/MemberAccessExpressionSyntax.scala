package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object MemberAccessExpressionSyntax {
  
  /* static member */
  @JSImport("typescript-services", "MemberAccessExpressionSyntax.create1")
  @js.native
  def create1(expression: IExpressionSyntax, name: ISyntaxToken): typings.typescriptServices.TypeScript.MemberAccessExpressionSyntax = js.native
}
