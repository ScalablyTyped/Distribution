package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.FunctionPropertyAssignmentSyntax")
@js.native
class FunctionPropertyAssignmentSyntax protected () extends SyntaxNode {
  def this(
    propertyName: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var block: BlockSyntax = js.native
  var callSignature: CallSignatureSyntax = js.native
  var propertyName: ISyntaxToken = js.native
  def isPropertyAssignment(): Boolean = js.native
  def update(propertyName: ISyntaxToken, callSignature: CallSignatureSyntax, block: BlockSyntax): FunctionPropertyAssignmentSyntax = js.native
  def withBlock(block: BlockSyntax): FunctionPropertyAssignmentSyntax = js.native
  def withCallSignature(callSignature: CallSignatureSyntax): FunctionPropertyAssignmentSyntax = js.native
  def withPropertyName(propertyName: ISyntaxToken): FunctionPropertyAssignmentSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.FunctionPropertyAssignmentSyntax")
@js.native
object FunctionPropertyAssignmentSyntax extends js.Object {
  def create1(propertyName: ISyntaxToken): FunctionPropertyAssignmentSyntax = js.native
}

