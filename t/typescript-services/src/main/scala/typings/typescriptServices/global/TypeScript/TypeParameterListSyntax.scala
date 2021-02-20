package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.TypeParameterListSyntax")
@js.native
class TypeParameterListSyntax protected ()
  extends typings.typescriptServices.TypeScript.TypeParameterListSyntax {
  def this(
    lessThanToken: ISyntaxToken,
    typeParameters: ISeparatedSyntaxList,
    greaterThanToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object TypeParameterListSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.TypeParameterListSyntax.create")
  @js.native
  def create(lessThanToken: ISyntaxToken, greaterThanToken: ISyntaxToken): typings.typescriptServices.TypeScript.TypeParameterListSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.TypeParameterListSyntax.create1")
  @js.native
  def create1(): typings.typescriptServices.TypeScript.TypeParameterListSyntax = js.native
}
