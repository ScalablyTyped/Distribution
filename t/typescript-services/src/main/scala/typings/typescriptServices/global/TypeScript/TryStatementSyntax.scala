package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.TryStatementSyntax")
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
/* static members */
@JSGlobal("TypeScript.TryStatementSyntax")
@js.native
object TryStatementSyntax extends js.Object {
  
  def create(tryKeyword: ISyntaxToken, block: typings.typescriptServices.TypeScript.BlockSyntax): typings.typescriptServices.TypeScript.TryStatementSyntax = js.native
  
  def create1(): typings.typescriptServices.TypeScript.TryStatementSyntax = js.native
}
