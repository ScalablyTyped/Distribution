package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ReturnStatementSyntax")
@js.native
class ReturnStatementSyntax protected ()
  extends typings.typescriptServices.TypeScript.ReturnStatementSyntax {
  def this(
    returnKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object ReturnStatementSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.ReturnStatementSyntax.create")
  @js.native
  def create(returnKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.ReturnStatementSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ReturnStatementSyntax.create1")
  @js.native
  def create1(): typings.typescriptServices.TypeScript.ReturnStatementSyntax = js.native
}
