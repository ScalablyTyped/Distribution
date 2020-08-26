package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "InterfaceDeclarationSyntax")
@js.native
class InterfaceDeclarationSyntax protected ()
  extends typings.typescriptServices.TypeScript.InterfaceDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    interfaceKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: typings.typescriptServices.TypeScript.TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    body: typings.typescriptServices.TypeScript.ObjectTypeSyntax,
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
    body: typings.typescriptServices.TypeScript.ObjectTypeSyntax
  ): typings.typescriptServices.TypeScript.InterfaceDeclarationSyntax = js.native
  def create1(identifier: ISyntaxToken): typings.typescriptServices.TypeScript.InterfaceDeclarationSyntax = js.native
}

