package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.FunctionDeclaration")
@js.native
class FunctionDeclaration protected () extends AST {
  def this(
    modifiers: js.Array[PullElementFlags],
    identifier: Identifier,
    callSignature: CallSignature,
    block: Block
  ) = this()
  var block: Block = js.native
  var callSignature: CallSignature = js.native
  var identifier: Identifier = js.native
  var modifiers: js.Array[PullElementFlags] = js.native
  def structuralEquals(ast: FunctionDeclaration, includingPosition: Boolean): Boolean = js.native
}

