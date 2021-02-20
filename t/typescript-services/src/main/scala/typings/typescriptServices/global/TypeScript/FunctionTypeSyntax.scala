package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ITypeSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.FunctionTypeSyntax")
@js.native
class FunctionTypeSyntax protected ()
  extends typings.typescriptServices.TypeScript.FunctionTypeSyntax {
  def this(
    typeParameterList: typings.typescriptServices.TypeScript.TypeParameterListSyntax,
    parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object FunctionTypeSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.FunctionTypeSyntax.create")
  @js.native
  def create(
    parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): typings.typescriptServices.TypeScript.FunctionTypeSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.FunctionTypeSyntax.create1")
  @js.native
  def create1(`type`: ITypeSyntax): typings.typescriptServices.TypeScript.FunctionTypeSyntax = js.native
}
