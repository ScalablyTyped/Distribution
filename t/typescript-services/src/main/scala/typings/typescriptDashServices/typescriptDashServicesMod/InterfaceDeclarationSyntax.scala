package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "InterfaceDeclarationSyntax")
@js.native
class InterfaceDeclarationSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.InterfaceDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    interfaceKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: typings.typescriptDashServices.TypeScript.TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    body: typings.typescriptDashServices.TypeScript.ObjectTypeSyntax,
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
    body: typings.typescriptDashServices.TypeScript.ObjectTypeSyntax
  ): typings.typescriptDashServices.TypeScript.InterfaceDeclarationSyntax = js.native
  def create1(identifier: ISyntaxToken): typings.typescriptDashServices.TypeScript.InterfaceDeclarationSyntax = js.native
}

