package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "SetAccessorSyntax")
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
  @JSImport("typescript-services", "SetAccessorSyntax.create")
  @js.native
  def create(
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
    block: typings.typescriptServices.TypeScript.BlockSyntax
  ): typings.typescriptServices.TypeScript.SetAccessorSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "SetAccessorSyntax.create1")
  @js.native
  def create1(propertyName: ISyntaxToken): typings.typescriptServices.TypeScript.SetAccessorSyntax = js.native
}
