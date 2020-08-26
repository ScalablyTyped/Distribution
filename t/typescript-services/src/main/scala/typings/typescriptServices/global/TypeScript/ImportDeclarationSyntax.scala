package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IModuleReferenceSyntax
import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

/* static members */
@JSGlobal("TypeScript.ImportDeclarationSyntax")
@js.native
object ImportDeclarationSyntax extends js.Object {
  def create(
    importKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    equalsToken: ISyntaxToken,
    moduleReference: IModuleReferenceSyntax,
    semicolonToken: ISyntaxToken
  ): typings.typescriptServices.TypeScript.ImportDeclarationSyntax = js.native
  def create1(identifier: ISyntaxToken, moduleReference: IModuleReferenceSyntax): typings.typescriptServices.TypeScript.ImportDeclarationSyntax = js.native
}

