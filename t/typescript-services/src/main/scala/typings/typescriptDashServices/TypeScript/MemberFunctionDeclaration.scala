package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.MemberFunctionDeclaration")
@js.native
class MemberFunctionDeclaration protected () extends AST {
  def this(
    modifiers: js.Array[PullElementFlags],
    propertyName: IASTToken,
    callSignature: CallSignature,
    block: Block
  ) = this()
  var block: Block = js.native
  var callSignature: CallSignature = js.native
  var modifiers: js.Array[PullElementFlags] = js.native
  var propertyName: IASTToken = js.native
}

