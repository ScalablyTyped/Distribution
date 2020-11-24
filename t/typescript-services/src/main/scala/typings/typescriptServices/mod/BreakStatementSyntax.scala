package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
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
/* static members */
@JSImport("typescript-services", "BreakStatementSyntax")
@js.native
object BreakStatementSyntax extends js.Object {
  
  def create(breakKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.BreakStatementSyntax = js.native
  
  def create1(): typings.typescriptServices.TypeScript.BreakStatementSyntax = js.native
}
