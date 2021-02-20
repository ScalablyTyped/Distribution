package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IModuleReferenceSyntax
import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ImportDeclarationSyntax")
@js.native
class ImportDeclarationSyntax protected ()
  extends typings.typescriptServices.TypeScript.ImportDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    importKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    equalsToken: ISyntaxToken,
    moduleReference: IModuleReferenceSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object ImportDeclarationSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.ImportDeclarationSyntax.create")
  @js.native
  def create(
    importKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    equalsToken: ISyntaxToken,
    moduleReference: IModuleReferenceSyntax,
    semicolonToken: ISyntaxToken
  ): typings.typescriptServices.TypeScript.ImportDeclarationSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ImportDeclarationSyntax.create1")
  @js.native
  def create1(identifier: ISyntaxToken, moduleReference: IModuleReferenceSyntax): typings.typescriptServices.TypeScript.ImportDeclarationSyntax = js.native
}
