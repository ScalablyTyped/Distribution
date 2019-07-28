package typings.tsutils.utilControlDashFlowMod

import typings.typescript.typescriptMod.BlockLike
import typings.typescript.typescriptMod.Identifier
import typings.typescript.typescriptMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/control-flow", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def endsControlFlow(statement: BlockLike): Boolean = js.native
  def endsControlFlow(statement: Statement): Boolean = js.native
  def getControlFlowEnd(statement: BlockLike): ControlFlowEnd = js.native
  def getControlFlowEnd(statement: BlockLike, label: Identifier): ControlFlowEnd = js.native
  def getControlFlowEnd(statement: Statement): ControlFlowEnd = js.native
  def getControlFlowEnd(statement: Statement, label: Identifier): ControlFlowEnd = js.native
}

