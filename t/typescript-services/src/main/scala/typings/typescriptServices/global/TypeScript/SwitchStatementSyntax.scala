package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.SwitchStatementSyntax")
@js.native
class SwitchStatementSyntax protected ()
  extends typings.typescriptServices.TypeScript.SwitchStatementSyntax {
  def this(
    switchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    switchClauses: ISyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object SwitchStatementSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.SwitchStatementSyntax.create")
  @js.native
  def create(
    switchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    closeBraceToken: ISyntaxToken
  ): typings.typescriptServices.TypeScript.SwitchStatementSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.SwitchStatementSyntax.create1")
  @js.native
  def create1(expression: IExpressionSyntax): typings.typescriptServices.TypeScript.SwitchStatementSyntax = js.native
}
