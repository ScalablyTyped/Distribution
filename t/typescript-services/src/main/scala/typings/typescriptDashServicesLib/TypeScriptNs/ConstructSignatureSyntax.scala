package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptDashServicesLib.TypeScriptNs.ITypeMemberSyntax because Already inherited */ @JSGlobal("TypeScript.ConstructSignatureSyntax")
@js.native
class ConstructSignatureSyntax protected () extends SyntaxNode {
  def this(newKeyword: ISyntaxToken, callSignature: CallSignatureSyntax, parsedInStrictMode: scala.Boolean) = this()
  var callSignature: CallSignatureSyntax = js.native
  var newKeyword: ISyntaxToken = js.native
  def update(newKeyword: ISyntaxToken, callSignature: CallSignatureSyntax): ConstructSignatureSyntax = js.native
  def withCallSignature(callSignature: CallSignatureSyntax): ConstructSignatureSyntax = js.native
  def withNewKeyword(newKeyword: ISyntaxToken): ConstructSignatureSyntax = js.native
}

@JSGlobal("TypeScript.ConstructSignatureSyntax")
@js.native
object ConstructSignatureSyntax extends js.Object {
  def create1(): typescriptDashServicesLib.TypeScriptNs.ConstructSignatureSyntax = js.native
}

