package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ParameterListSyntax")
@js.native
class ParameterListSyntax protected ()
  extends typings.typescriptServices.TypeScript.ParameterListSyntax {
  def this(
    openParenToken: ISyntaxToken,
    parameters: ISeparatedSyntaxList,
    closeParenToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object ParameterListSyntax {
  
  /* static member */
  @JSImport("typescript-services", "ParameterListSyntax.create")
  @js.native
  def create(openParenToken: ISyntaxToken, closeParenToken: ISyntaxToken): typings.typescriptServices.TypeScript.ParameterListSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "ParameterListSyntax.create1")
  @js.native
  def create1(): typings.typescriptServices.TypeScript.ParameterListSyntax = js.native
}
