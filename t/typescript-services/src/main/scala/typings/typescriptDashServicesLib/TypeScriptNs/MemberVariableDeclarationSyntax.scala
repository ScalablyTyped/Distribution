package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typescriptDashServicesLib.TypeScriptNs.IMemberDeclarationSyntax because Already inherited)*/
@JSGlobal("TypeScript.MemberVariableDeclarationSyntax")
@js.native
class MemberVariableDeclarationSyntax protected () extends SyntaxNode {
  def this(modifiers: ISyntaxList, variableDeclarator: VariableDeclaratorSyntax, semicolonToken: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var modifiers: ISyntaxList = js.native
  var semicolonToken: ISyntaxToken = js.native
  var variableDeclarator: VariableDeclaratorSyntax = js.native
  def isMemberDeclaration(): scala.Boolean = js.native
  def update(modifiers: ISyntaxList, variableDeclarator: VariableDeclaratorSyntax, semicolonToken: ISyntaxToken): MemberVariableDeclarationSyntax = js.native
  def withModifier(modifier: ISyntaxToken): MemberVariableDeclarationSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): MemberVariableDeclarationSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): MemberVariableDeclarationSyntax = js.native
  def withVariableDeclarator(variableDeclarator: VariableDeclaratorSyntax): MemberVariableDeclarationSyntax = js.native
}

@JSGlobal("TypeScript.MemberVariableDeclarationSyntax")
@js.native
object MemberVariableDeclarationSyntax extends js.Object {
  def create(
    variableDeclarator: typescriptDashServicesLib.TypeScriptNs.VariableDeclaratorSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.MemberVariableDeclarationSyntax = js.native
  def create1(variableDeclarator: typescriptDashServicesLib.TypeScriptNs.VariableDeclaratorSyntax): typescriptDashServicesLib.TypeScriptNs.MemberVariableDeclarationSyntax = js.native
}

