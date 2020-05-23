package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberVariableDeclarationSyntax extends SyntaxNode {
  var modifiers: ISyntaxList = js.native
  var semicolonToken: ISyntaxToken = js.native
  var variableDeclarator: VariableDeclaratorSyntax = js.native
  def isMemberDeclaration(): Boolean = js.native
  def update(modifiers: ISyntaxList, variableDeclarator: VariableDeclaratorSyntax, semicolonToken: ISyntaxToken): MemberVariableDeclarationSyntax = js.native
  def withModifier(modifier: ISyntaxToken): MemberVariableDeclarationSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): MemberVariableDeclarationSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): MemberVariableDeclarationSyntax = js.native
  def withVariableDeclarator(variableDeclarator: VariableDeclaratorSyntax): MemberVariableDeclarationSyntax = js.native
}

