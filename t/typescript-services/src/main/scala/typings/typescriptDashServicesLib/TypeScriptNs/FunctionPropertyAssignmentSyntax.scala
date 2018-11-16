package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typescriptDashServicesLib.TypeScriptNs.IPropertyAssignmentSyntax because Already inherited)*/
@JSGlobal("TypeScript.FunctionPropertyAssignmentSyntax")
@js.native
class FunctionPropertyAssignmentSyntax protected () extends SyntaxNode {
  def this(propertyName: ISyntaxToken, callSignature: CallSignatureSyntax, block: BlockSyntax, parsedInStrictMode: scala.Boolean) = this()
  var block: BlockSyntax = js.native
  var callSignature: CallSignatureSyntax = js.native
  var propertyName: ISyntaxToken = js.native
  def isPropertyAssignment(): scala.Boolean = js.native
  def update(propertyName: ISyntaxToken, callSignature: CallSignatureSyntax, block: BlockSyntax): FunctionPropertyAssignmentSyntax = js.native
  def withBlock(block: BlockSyntax): FunctionPropertyAssignmentSyntax = js.native
  def withCallSignature(callSignature: CallSignatureSyntax): FunctionPropertyAssignmentSyntax = js.native
  def withPropertyName(propertyName: ISyntaxToken): FunctionPropertyAssignmentSyntax = js.native
}

@JSGlobal("TypeScript.FunctionPropertyAssignmentSyntax")
@js.native
object FunctionPropertyAssignmentSyntax extends js.Object {
  def create1(propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): typescriptDashServicesLib.TypeScriptNs.FunctionPropertyAssignmentSyntax = js.native
}

