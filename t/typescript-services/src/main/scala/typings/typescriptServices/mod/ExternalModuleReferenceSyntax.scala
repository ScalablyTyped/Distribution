package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ExternalModuleReferenceSyntax")
@js.native
class ExternalModuleReferenceSyntax protected ()
  extends typings.typescriptServices.TypeScript.ExternalModuleReferenceSyntax {
  def this(
    requireKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    stringLiteral: ISyntaxToken,
    closeParenToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object ExternalModuleReferenceSyntax {
  
  /* static member */
  @JSImport("typescript-services", "ExternalModuleReferenceSyntax.create1")
  @js.native
  def create1(stringLiteral: ISyntaxToken): typings.typescriptServices.TypeScript.ExternalModuleReferenceSyntax = js.native
}
