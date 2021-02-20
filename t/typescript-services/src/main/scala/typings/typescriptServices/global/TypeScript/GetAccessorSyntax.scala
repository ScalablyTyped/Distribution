package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.GetAccessorSyntax")
@js.native
class GetAccessorSyntax protected ()
  extends typings.typescriptServices.TypeScript.GetAccessorSyntax {
  def this(
    modifiers: ISyntaxList,
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
    typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax,
    block: typings.typescriptServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object GetAccessorSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.GetAccessorSyntax.create")
  @js.native
  def create(
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
    block: typings.typescriptServices.TypeScript.BlockSyntax
  ): typings.typescriptServices.TypeScript.GetAccessorSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.GetAccessorSyntax.create1")
  @js.native
  def create1(propertyName: ISyntaxToken): typings.typescriptServices.TypeScript.GetAccessorSyntax = js.native
}
