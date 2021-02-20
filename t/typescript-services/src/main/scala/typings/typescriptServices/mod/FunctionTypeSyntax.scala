package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ITypeSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "FunctionTypeSyntax")
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
  @JSImport("typescript-services", "FunctionTypeSyntax.create")
  @js.native
  def create(
    parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): typings.typescriptServices.TypeScript.FunctionTypeSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "FunctionTypeSyntax.create1")
  @js.native
  def create1(`type`: ITypeSyntax): typings.typescriptServices.TypeScript.FunctionTypeSyntax = js.native
}
