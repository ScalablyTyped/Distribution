package typings
package tsutilsLib.utilControlDashFlowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/control-flow", JSImport.Namespace)
@js.native
object utilControlDashFlowModMembers extends js.Object {
  def endsControlFlow(statement: typescriptLib.typescriptMod.tsNs.BlockLike): scala.Boolean = js.native
  def endsControlFlow(statement: typescriptLib.typescriptMod.tsNs.Statement): scala.Boolean = js.native
  def getControlFlowEnd(statement: typescriptLib.typescriptMod.tsNs.BlockLike): ControlFlowEnd = js.native
  def getControlFlowEnd(
    statement: typescriptLib.typescriptMod.tsNs.BlockLike,
    label: typescriptLib.typescriptMod.tsNs.Identifier
  ): ControlFlowEnd = js.native
  def getControlFlowEnd(statement: typescriptLib.typescriptMod.tsNs.Statement): ControlFlowEnd = js.native
  def getControlFlowEnd(
    statement: typescriptLib.typescriptMod.tsNs.Statement,
    label: typescriptLib.typescriptMod.tsNs.Identifier
  ): ControlFlowEnd = js.native
}

