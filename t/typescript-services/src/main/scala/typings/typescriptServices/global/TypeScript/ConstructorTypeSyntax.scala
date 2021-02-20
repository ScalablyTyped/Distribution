package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ITypeSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ConstructorTypeSyntax")
@js.native
class ConstructorTypeSyntax protected ()
  extends typings.typescriptServices.TypeScript.ConstructorTypeSyntax {
  def this(
    newKeyword: ISyntaxToken,
    typeParameterList: typings.typescriptServices.TypeScript.TypeParameterListSyntax,
    parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object ConstructorTypeSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.ConstructorTypeSyntax.create")
  @js.native
  def create(
    newKeyword: ISyntaxToken,
    parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): typings.typescriptServices.TypeScript.ConstructorTypeSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ConstructorTypeSyntax.create1")
  @js.native
  def create1(`type`: ITypeSyntax): typings.typescriptServices.TypeScript.ConstructorTypeSyntax = js.native
}
