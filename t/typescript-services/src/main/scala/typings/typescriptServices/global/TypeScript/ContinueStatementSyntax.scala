package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ContinueStatementSyntax")
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
  @JSGlobal("TypeScript.ContinueStatementSyntax.create")
  @js.native
  def create(continueKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.ContinueStatementSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ContinueStatementSyntax.create1")
  @js.native
  def create1(): typings.typescriptServices.TypeScript.ContinueStatementSyntax = js.native
}
