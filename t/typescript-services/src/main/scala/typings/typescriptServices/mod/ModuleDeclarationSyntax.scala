package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.INameSyntax
import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ModuleDeclarationSyntax")
@js.native
class ModuleDeclarationSyntax protected ()
  extends typings.typescriptServices.TypeScript.ModuleDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    moduleKeyword: ISyntaxToken,
    name: INameSyntax,
    stringLiteral: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    moduleElements: ISyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object ModuleDeclarationSyntax {
  
  /* static member */
  @JSImport("typescript-services", "ModuleDeclarationSyntax.create")
  @js.native
  def create(moduleKeyword: ISyntaxToken, openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): typings.typescriptServices.TypeScript.ModuleDeclarationSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "ModuleDeclarationSyntax.create1")
  @js.native
  def create1(): typings.typescriptServices.TypeScript.ModuleDeclarationSyntax = js.native
}
