package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ArgumentListSyntax")
@js.native
class ArgumentListSyntax protected ()
  extends typings.typescriptServices.TypeScript.ArgumentListSyntax {
  def this(
    typeArgumentList: typings.typescriptServices.TypeScript.TypeArgumentListSyntax,
    openParenToken: ISyntaxToken,
    _arguments: ISeparatedSyntaxList,
    closeParenToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object ArgumentListSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.ArgumentListSyntax.create")
  @js.native
  def create(openParenToken: ISyntaxToken, closeParenToken: ISyntaxToken): typings.typescriptServices.TypeScript.ArgumentListSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ArgumentListSyntax.create1")
  @js.native
  def create1(): typings.typescriptServices.TypeScript.ArgumentListSyntax = js.native
}
