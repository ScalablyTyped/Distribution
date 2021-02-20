package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "BreakStatementSyntax")
@js.native
class BreakStatementSyntax protected ()
  extends typings.typescriptServices.TypeScript.BreakStatementSyntax {
  def this(
    breakKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object BreakStatementSyntax {
  
  /* static member */
  @JSImport("typescript-services", "BreakStatementSyntax.create")
  @js.native
  def create(breakKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.BreakStatementSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "BreakStatementSyntax.create1")
  @js.native
  def create1(): typings.typescriptServices.TypeScript.BreakStatementSyntax = js.native
}
