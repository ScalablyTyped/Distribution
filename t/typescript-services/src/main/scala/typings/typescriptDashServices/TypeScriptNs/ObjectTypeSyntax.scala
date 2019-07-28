package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescriptDashServices.TypeScriptNs.ITypeSyntax because Already inherited */ @JSGlobal("TypeScript.ObjectTypeSyntax")
@js.native
class ObjectTypeSyntax protected () extends SyntaxNode {
  def this(
    openBraceToken: ISyntaxToken,
    typeMembers: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var closeBraceToken: ISyntaxToken = js.native
  var openBraceToken: ISyntaxToken = js.native
  var typeMembers: ISeparatedSyntaxList = js.native
  def isType(): Boolean = js.native
  def update(openBraceToken: ISyntaxToken, typeMembers: ISeparatedSyntaxList, closeBraceToken: ISyntaxToken): ObjectTypeSyntax = js.native
  def withCloseBraceToken(closeBraceToken: ISyntaxToken): ObjectTypeSyntax = js.native
  def withOpenBraceToken(openBraceToken: ISyntaxToken): ObjectTypeSyntax = js.native
  def withTypeMember(typeMember: ITypeMemberSyntax): ObjectTypeSyntax = js.native
  def withTypeMembers(typeMembers: ISeparatedSyntaxList): ObjectTypeSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ObjectTypeSyntax")
@js.native
object ObjectTypeSyntax extends js.Object {
  def create(openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): ObjectTypeSyntax = js.native
  def create1(): ObjectTypeSyntax = js.native
}

