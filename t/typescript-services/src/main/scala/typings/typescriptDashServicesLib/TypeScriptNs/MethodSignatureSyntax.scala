package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptDashServicesLib.TypeScriptNs.ITypeMemberSyntax because Already inherited */ @JSGlobal("TypeScript.MethodSignatureSyntax")
@js.native
class MethodSignatureSyntax protected () extends SyntaxNode {
  def this(propertyName: ISyntaxToken, questionToken: ISyntaxToken, callSignature: CallSignatureSyntax, parsedInStrictMode: scala.Boolean) = this()
  var callSignature: CallSignatureSyntax = js.native
  var propertyName: ISyntaxToken = js.native
  var questionToken: ISyntaxToken = js.native
  def update(propertyName: ISyntaxToken, questionToken: ISyntaxToken, callSignature: CallSignatureSyntax): MethodSignatureSyntax = js.native
  def withCallSignature(callSignature: CallSignatureSyntax): MethodSignatureSyntax = js.native
  def withPropertyName(propertyName: ISyntaxToken): MethodSignatureSyntax = js.native
  def withQuestionToken(questionToken: ISyntaxToken): MethodSignatureSyntax = js.native
}

@JSGlobal("TypeScript.MethodSignatureSyntax")
@js.native
object MethodSignatureSyntax extends js.Object {
  def create(
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax
  ): typescriptDashServicesLib.TypeScriptNs.MethodSignatureSyntax = js.native
  def create1(propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): typescriptDashServicesLib.TypeScriptNs.MethodSignatureSyntax = js.native
}

