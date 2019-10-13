package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.MemberVariableDeclarationSyntax")
@js.native
class MemberVariableDeclarationSyntax protected () extends SyntaxNode {
  def this(
    modifiers: ISyntaxList,
    variableDeclarator: VariableDeclaratorSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
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

/* static members */
@JSGlobal("TypeScript.MemberVariableDeclarationSyntax")
@js.native
object MemberVariableDeclarationSyntax extends js.Object {
  def create(variableDeclarator: VariableDeclaratorSyntax, semicolonToken: ISyntaxToken): MemberVariableDeclarationSyntax = js.native
  def create1(variableDeclarator: VariableDeclaratorSyntax): MemberVariableDeclarationSyntax = js.native
}

