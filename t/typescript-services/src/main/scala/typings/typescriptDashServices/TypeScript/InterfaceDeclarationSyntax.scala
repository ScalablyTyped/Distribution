package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.InterfaceDeclarationSyntax")
@js.native
class InterfaceDeclarationSyntax protected () extends SyntaxNode {
  def this(
    modifiers: ISyntaxList,
    interfaceKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    body: ObjectTypeSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var body: ObjectTypeSyntax = js.native
  var heritageClauses: ISyntaxList = js.native
  var identifier: ISyntaxToken = js.native
  var interfaceKeyword: ISyntaxToken = js.native
  var modifiers: ISyntaxList = js.native
  var typeParameterList: TypeParameterListSyntax = js.native
  def update(
    modifiers: ISyntaxList,
    interfaceKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    body: ObjectTypeSyntax
  ): InterfaceDeclarationSyntax = js.native
  def withBody(body: ObjectTypeSyntax): InterfaceDeclarationSyntax = js.native
  def withHeritageClause(heritageClause: HeritageClauseSyntax): InterfaceDeclarationSyntax = js.native
  def withHeritageClauses(heritageClauses: ISyntaxList): InterfaceDeclarationSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): InterfaceDeclarationSyntax = js.native
  def withInterfaceKeyword(interfaceKeyword: ISyntaxToken): InterfaceDeclarationSyntax = js.native
  def withModifier(modifier: ISyntaxToken): InterfaceDeclarationSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): InterfaceDeclarationSyntax = js.native
  def withTypeParameterList(typeParameterList: TypeParameterListSyntax): InterfaceDeclarationSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.InterfaceDeclarationSyntax")
@js.native
object InterfaceDeclarationSyntax extends js.Object {
  def create(interfaceKeyword: ISyntaxToken, identifier: ISyntaxToken, body: ObjectTypeSyntax): InterfaceDeclarationSyntax = js.native
  def create1(identifier: ISyntaxToken): InterfaceDeclarationSyntax = js.native
}

