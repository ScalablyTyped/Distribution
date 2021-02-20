package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ContinueStatementSyntax")
@js.native
class ContinueStatementSyntax protected ()
  extends typings.typescriptServices.TypeScript.ContinueStatementSyntax {
  def this(
    continueKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object ContinueStatementSyntax {
  
  /* static member */
  @JSImport("typescript-services", "ContinueStatementSyntax.create")
  @js.native
  def create(continueKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.ContinueStatementSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "ContinueStatementSyntax.create1")
  @js.native
  def create1(): typings.typescriptServices.TypeScript.ContinueStatementSyntax = js.native
}
