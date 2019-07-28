package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescriptDashServices.TypeScriptNs.ITypeSyntax because Already inherited */ @JSGlobal("TypeScript.GenericTypeSyntax")
@js.native
class GenericTypeSyntax protected () extends SyntaxNode {
  def this(name: INameSyntax, typeArgumentList: TypeArgumentListSyntax, parsedInStrictMode: Boolean) = this()
  var name: INameSyntax = js.native
  var typeArgumentList: TypeArgumentListSyntax = js.native
  def isType(): Boolean = js.native
  def update(name: INameSyntax, typeArgumentList: TypeArgumentListSyntax): GenericTypeSyntax = js.native
  def withName(name: INameSyntax): GenericTypeSyntax = js.native
  def withTypeArgumentList(typeArgumentList: TypeArgumentListSyntax): GenericTypeSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.GenericTypeSyntax")
@js.native
object GenericTypeSyntax extends js.Object {
  def create1(name: INameSyntax): GenericTypeSyntax = js.native
}

