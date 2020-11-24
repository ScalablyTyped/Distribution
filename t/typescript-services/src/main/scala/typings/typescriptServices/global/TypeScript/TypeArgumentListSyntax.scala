package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.TypeArgumentListSyntax")
@js.native
class TypeArgumentListSyntax protected ()
  extends typings.typescriptServices.TypeScript.TypeArgumentListSyntax {
  def this(
    lessThanToken: ISyntaxToken,
    typeArguments: ISeparatedSyntaxList,
    greaterThanToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.TypeArgumentListSyntax")
@js.native
object TypeArgumentListSyntax extends js.Object {
  
  def create(lessThanToken: ISyntaxToken, greaterThanToken: ISyntaxToken): typings.typescriptServices.TypeScript.TypeArgumentListSyntax = js.native
  
  def create1(): typings.typescriptServices.TypeScript.TypeArgumentListSyntax = js.native
}
