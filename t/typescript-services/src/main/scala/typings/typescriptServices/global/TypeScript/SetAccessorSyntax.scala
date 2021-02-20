package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.SetAccessorSyntax")
@js.native
class SetAccessorSyntax protected ()
  extends typings.typescriptServices.TypeScript.SetAccessorSyntax {
  def this(
    modifiers: ISyntaxList,
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
    block: typings.typescriptServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object SetAccessorSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.SetAccessorSyntax.create")
  @js.native
  def create(
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
    block: typings.typescriptServices.TypeScript.BlockSyntax
  ): typings.typescriptServices.TypeScript.SetAccessorSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.SetAccessorSyntax.create1")
  @js.native
  def create1(propertyName: ISyntaxToken): typings.typescriptServices.TypeScript.SetAccessorSyntax = js.native
}
