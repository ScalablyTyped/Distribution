package typings.tsutils.controlFlowMod

import typings.typescript.mod.BlockLike
import typings.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/control-flow", "getControlFlowEnd")
@js.native
object getControlFlowEnd extends js.Object {
  def apply(statement: BlockLike): ControlFlowEnd = js.native
  def apply(statement: Statement): ControlFlowEnd = js.native
}

