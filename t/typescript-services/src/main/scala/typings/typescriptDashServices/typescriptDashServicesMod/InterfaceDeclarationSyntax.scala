package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "InterfaceDeclarationSyntax")
@js.native
class InterfaceDeclarationSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.InterfaceDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    interfaceKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: typings.typescriptDashServices.TypeScriptNs.TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    body: typings.typescriptDashServices.TypeScriptNs.ObjectTypeSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "InterfaceDeclarationSyntax")
@js.native
object InterfaceDeclarationSyntax extends js.Object {
  def create(
    interfaceKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    body: typings.typescriptDashServices.TypeScriptNs.ObjectTypeSyntax
  ): typings.typescriptDashServices.TypeScriptNs.InterfaceDeclarationSyntax = js.native
  def create1(identifier: ISyntaxToken): typings.typescriptDashServices.TypeScriptNs.InterfaceDeclarationSyntax = js.native
}

