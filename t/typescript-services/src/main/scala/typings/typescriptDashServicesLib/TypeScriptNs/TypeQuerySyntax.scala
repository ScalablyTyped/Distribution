package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptDashServicesLib.TypeScriptNs.ITypeSyntax because Already inherited */ @JSGlobal("TypeScript.TypeQuerySyntax")
@js.native
class TypeQuerySyntax protected () extends SyntaxNode {
  def this(typeOfKeyword: ISyntaxToken, name: INameSyntax, parsedInStrictMode: scala.Boolean) = this()
  var name: INameSyntax = js.native
  var typeOfKeyword: ISyntaxToken = js.native
  def isType(): scala.Boolean = js.native
  def update(typeOfKeyword: ISyntaxToken, name: INameSyntax): TypeQuerySyntax = js.native
  def withName(name: INameSyntax): TypeQuerySyntax = js.native
  def withTypeOfKeyword(typeOfKeyword: ISyntaxToken): TypeQuerySyntax = js.native
}

@JSGlobal("TypeScript.TypeQuerySyntax")
@js.native
object TypeQuerySyntax extends js.Object {
  def create1(name: typescriptDashServicesLib.TypeScriptNs.INameSyntax): typescriptDashServicesLib.TypeScriptNs.TypeQuerySyntax = js.native
}

