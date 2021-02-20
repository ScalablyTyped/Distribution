package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "TryStatementSyntax")
@js.native
class TryStatementSyntax protected ()
  extends typings.typescriptServices.TypeScript.TryStatementSyntax {
  def this(
    tryKeyword: ISyntaxToken,
    block: typings.typescriptServices.TypeScript.BlockSyntax,
    catchClause: typings.typescriptServices.TypeScript.CatchClauseSyntax,
    finallyClause: typings.typescriptServices.TypeScript.FinallyClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object TryStatementSyntax {
  
  /* static member */
  @JSImport("typescript-services", "TryStatementSyntax.create")
  @js.native
  def create(tryKeyword: ISyntaxToken, block: typings.typescriptServices.TypeScript.BlockSyntax): typings.typescriptServices.TypeScript.TryStatementSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "TryStatementSyntax.create1")
  @js.native
  def create1(): typings.typescriptServices.TypeScript.TryStatementSyntax = js.native
}
