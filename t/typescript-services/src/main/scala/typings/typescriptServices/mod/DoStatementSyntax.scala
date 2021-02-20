package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.IStatementSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "DoStatementSyntax")
@js.native
class DoStatementSyntax protected ()
  extends typings.typescriptServices.TypeScript.DoStatementSyntax {
  def this(
    doKeyword: ISyntaxToken,
    statement: IStatementSyntax,
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object DoStatementSyntax {
  
  /* static member */
  @JSImport("typescript-services", "DoStatementSyntax.create1")
  @js.native
  def create1(statement: IStatementSyntax, condition: IExpressionSyntax): typings.typescriptServices.TypeScript.DoStatementSyntax = js.native
}
