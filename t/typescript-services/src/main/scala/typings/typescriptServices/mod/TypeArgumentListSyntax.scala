package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "TypeArgumentListSyntax")
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
object TypeArgumentListSyntax {
  
  /* static member */
  @JSImport("typescript-services", "TypeArgumentListSyntax.create")
  @js.native
  def create(lessThanToken: ISyntaxToken, greaterThanToken: ISyntaxToken): typings.typescriptServices.TypeScript.TypeArgumentListSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "TypeArgumentListSyntax.create1")
  @js.native
  def create1(): typings.typescriptServices.TypeScript.TypeArgumentListSyntax = js.native
}
