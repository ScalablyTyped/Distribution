package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.FinallyClauseSyntax")
@js.native
class FinallyClauseSyntax protected ()
  extends typings.typescriptServices.TypeScript.FinallyClauseSyntax {
  def this(
    finallyKeyword: ISyntaxToken,
    block: typings.typescriptServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.FinallyClauseSyntax")
@js.native
object FinallyClauseSyntax extends js.Object {
  
  def create1(): typings.typescriptServices.TypeScript.FinallyClauseSyntax = js.native
}
