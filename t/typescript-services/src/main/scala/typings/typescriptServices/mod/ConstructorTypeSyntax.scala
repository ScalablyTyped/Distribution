package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ITypeSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ConstructorTypeSyntax")
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
  @JSImport("typescript-services", "ConstructorTypeSyntax.create")
  @js.native
  def create(
    newKeyword: ISyntaxToken,
    parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): typings.typescriptServices.TypeScript.ConstructorTypeSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "ConstructorTypeSyntax.create1")
  @js.native
  def create1(`type`: ITypeSyntax): typings.typescriptServices.TypeScript.ConstructorTypeSyntax = js.native
}
