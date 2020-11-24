package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IStatementSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ElseClauseSyntax")
@js.native
class ElseClauseSyntax protected ()
  extends typings.typescriptServices.TypeScript.ElseClauseSyntax {
  def this(elseKeyword: ISyntaxToken, statement: IStatementSyntax, parsedInStrictMode: Boolean) = this()
}
/* static members */
@JSGlobal("TypeScript.ElseClauseSyntax")
@js.native
object ElseClauseSyntax extends js.Object {
  
  def create1(statement: IStatementSyntax): typings.typescriptServices.TypeScript.ElseClauseSyntax = js.native
}
