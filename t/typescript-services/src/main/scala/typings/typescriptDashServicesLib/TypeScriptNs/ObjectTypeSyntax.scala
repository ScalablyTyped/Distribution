package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typescriptDashServicesLib.TypeScriptNs.ITypeSyntax because Already inherited)*/
@JSGlobal("TypeScript.ObjectTypeSyntax")
@js.native
class ObjectTypeSyntax protected () extends SyntaxNode {
  def this(openBraceToken: ISyntaxToken, typeMembers: ISeparatedSyntaxList, closeBraceToken: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var closeBraceToken: ISyntaxToken = js.native
  var openBraceToken: ISyntaxToken = js.native
  var typeMembers: ISeparatedSyntaxList = js.native
  def isType(): scala.Boolean = js.native
  def update(openBraceToken: ISyntaxToken, typeMembers: ISeparatedSyntaxList, closeBraceToken: ISyntaxToken): ObjectTypeSyntax = js.native
  def withCloseBraceToken(closeBraceToken: ISyntaxToken): ObjectTypeSyntax = js.native
  def withOpenBraceToken(openBraceToken: ISyntaxToken): ObjectTypeSyntax = js.native
  def withTypeMember(typeMember: ITypeMemberSyntax): ObjectTypeSyntax = js.native
  def withTypeMembers(typeMembers: ISeparatedSyntaxList): ObjectTypeSyntax = js.native
}

@JSGlobal("TypeScript.ObjectTypeSyntax")
@js.native
object ObjectTypeSyntax extends js.Object {
  def create(
    openBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    closeBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ObjectTypeSyntax = js.native
  def create1(): typescriptDashServicesLib.TypeScriptNs.ObjectTypeSyntax = js.native
}

