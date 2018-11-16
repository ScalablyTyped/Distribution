package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typescriptDashServicesLib.TypeScriptNs.ITypeSyntax because Already inherited)*/
@JSGlobal("TypeScript.GenericTypeSyntax")
@js.native
class GenericTypeSyntax protected () extends SyntaxNode {
  def this(name: INameSyntax, typeArgumentList: TypeArgumentListSyntax, parsedInStrictMode: scala.Boolean) = this()
  var name: INameSyntax = js.native
  var typeArgumentList: TypeArgumentListSyntax = js.native
  def isType(): scala.Boolean = js.native
  def update(name: INameSyntax, typeArgumentList: TypeArgumentListSyntax): GenericTypeSyntax = js.native
  def withName(name: INameSyntax): GenericTypeSyntax = js.native
  def withTypeArgumentList(typeArgumentList: TypeArgumentListSyntax): GenericTypeSyntax = js.native
}

@JSGlobal("TypeScript.GenericTypeSyntax")
@js.native
object GenericTypeSyntax extends js.Object {
  def create1(name: typescriptDashServicesLib.TypeScriptNs.INameSyntax): typescriptDashServicesLib.TypeScriptNs.GenericTypeSyntax = js.native
}

