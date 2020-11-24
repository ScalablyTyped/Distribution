package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
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
/* static members */
@JSGlobal("TypeScript.ContinueStatementSyntax")
@js.native
object ContinueStatementSyntax extends js.Object {
  
  def create(continueKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.ContinueStatementSyntax = js.native
  
  def create1(): typings.typescriptServices.TypeScript.ContinueStatementSyntax = js.native
}
