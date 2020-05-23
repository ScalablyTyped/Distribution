package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportDeclarationSyntax extends SyntaxNode {
  var equalsToken: ISyntaxToken = js.native
  var identifier: ISyntaxToken = js.native
  var importKeyword: ISyntaxToken = js.native
  var modifiers: ISyntaxList = js.native
  var moduleReference: IModuleReferenceSyntax = js.native
  var semicolonToken: ISyntaxToken = js.native
  def update(
    modifiers: ISyntaxList,
    importKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    equalsToken: ISyntaxToken,
    moduleReference: IModuleReferenceSyntax,
    semicolonToken: ISyntaxToken
  ): ImportDeclarationSyntax = js.native
  def withEqualsToken(equalsToken: ISyntaxToken): ImportDeclarationSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): ImportDeclarationSyntax = js.native
  def withImportKeyword(importKeyword: ISyntaxToken): ImportDeclarationSyntax = js.native
  def withModifier(modifier: ISyntaxToken): ImportDeclarationSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): ImportDeclarationSyntax = js.native
  def withModuleReference(moduleReference: IModuleReferenceSyntax): ImportDeclarationSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): ImportDeclarationSyntax = js.native
}

