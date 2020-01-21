package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsConverter.operationsTypesMod.OpExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "registerOp")
@js.native
object registerOp extends js.Object {
  def apply(name: String, opFunc: OpExecutor): Unit = js.native
}

