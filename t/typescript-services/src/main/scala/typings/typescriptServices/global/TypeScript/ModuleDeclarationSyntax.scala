package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.INameSyntax
import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ModuleDeclarationSyntax")
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

/* static members */
@JSGlobal("TypeScript.ModuleDeclarationSyntax")
@js.native
object ModuleDeclarationSyntax extends js.Object {
  def create(moduleKeyword: ISyntaxToken, openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): typings.typescriptServices.TypeScript.ModuleDeclarationSyntax = js.native
  def create1(): typings.typescriptServices.TypeScript.ModuleDeclarationSyntax = js.native
}

