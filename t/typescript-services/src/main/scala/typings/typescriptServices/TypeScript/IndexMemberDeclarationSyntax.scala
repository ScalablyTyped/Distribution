package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexMemberDeclarationSyntax extends SyntaxNode {
  var indexSignature: IndexSignatureSyntax = js.native
  var modifiers: ISyntaxList = js.native
  var semicolonToken: ISyntaxToken = js.native
  def update(modifiers: ISyntaxList, indexSignature: IndexSignatureSyntax, semicolonToken: ISyntaxToken): IndexMemberDeclarationSyntax = js.native
  def withIndexSignature(indexSignature: IndexSignatureSyntax): IndexMemberDeclarationSyntax = js.native
  def withModifier(modifier: ISyntaxToken): IndexMemberDeclarationSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): IndexMemberDeclarationSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): IndexMemberDeclarationSyntax = js.native
}

