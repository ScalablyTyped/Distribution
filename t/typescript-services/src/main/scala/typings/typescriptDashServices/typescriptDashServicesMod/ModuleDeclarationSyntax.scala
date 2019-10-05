package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.INameSyntax
import typings.typescriptDashServices.TypeScript.ISyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ModuleDeclarationSyntax")
@js.native
class ModuleDeclarationSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.ModuleDeclarationSyntax {
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

/* static members */
@JSImport("typescript-services", "ModuleDeclarationSyntax")
@js.native
object ModuleDeclarationSyntax extends js.Object {
  def create(moduleKeyword: ISyntaxToken, openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): typings.typescriptDashServices.TypeScript.ModuleDeclarationSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScript.ModuleDeclarationSyntax = js.native
}

