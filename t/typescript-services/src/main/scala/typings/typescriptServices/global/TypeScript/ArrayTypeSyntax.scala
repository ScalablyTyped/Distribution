package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ITypeSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ArrayTypeSyntax")
@js.native
class ArrayTypeSyntax protected ()
  extends typings.typescriptServices.TypeScript.ArrayTypeSyntax {
  def this(
    `type`: ITypeSyntax,
    openBracketToken: ISyntaxToken,
    closeBracketToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.ArrayTypeSyntax")
@js.native
object ArrayTypeSyntax extends js.Object {
  
  def create1(`type`: ITypeSyntax): typings.typescriptServices.TypeScript.ArrayTypeSyntax = js.native
}
