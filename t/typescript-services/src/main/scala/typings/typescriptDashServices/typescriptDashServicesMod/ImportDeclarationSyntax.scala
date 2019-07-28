package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.IModuleReferenceSyntax
import typings.typescriptDashServices.TypeScriptNs.ISyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ImportDeclarationSyntax")
@js.native
class ImportDeclarationSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.ImportDeclarationSyntax {
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
@JSImport("typescript-services", "ImportDeclarationSyntax")
@js.native
object ImportDeclarationSyntax extends js.Object {
  def create(
    importKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    equalsToken: ISyntaxToken,
    moduleReference: IModuleReferenceSyntax,
    semicolonToken: ISyntaxToken
  ): typings.typescriptDashServices.TypeScriptNs.ImportDeclarationSyntax = js.native
  def create1(identifier: ISyntaxToken, moduleReference: IModuleReferenceSyntax): typings.typescriptDashServices.TypeScriptNs.ImportDeclarationSyntax = js.native
}

