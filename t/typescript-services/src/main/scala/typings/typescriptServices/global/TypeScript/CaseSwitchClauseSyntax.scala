package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.CaseSwitchClauseSyntax")
@js.native
class CaseSwitchClauseSyntax protected ()
  extends typings.typescriptServices.TypeScript.CaseSwitchClauseSyntax {
  def this(
    caseKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    colonToken: ISyntaxToken,
    statements: ISyntaxList,
    parsedInStrictMode: Boolean
  ) = this()
}
object CaseSwitchClauseSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.CaseSwitchClauseSyntax.create")
  @js.native
  def create(caseKeyword: ISyntaxToken, expression: IExpressionSyntax, colonToken: ISyntaxToken): typings.typescriptServices.TypeScript.CaseSwitchClauseSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.CaseSwitchClauseSyntax.create1")
  @js.native
  def create1(expression: IExpressionSyntax): typings.typescriptServices.TypeScript.CaseSwitchClauseSyntax = js.native
}
