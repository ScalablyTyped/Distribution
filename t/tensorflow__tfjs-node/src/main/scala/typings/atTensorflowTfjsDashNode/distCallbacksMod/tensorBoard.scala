package typings.atTensorflowTfjsDashNode.distCallbacksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/callbacks", "tensorBoard")
@js.native
object tensorBoard extends js.Object {
  def apply(): TensorBoardCallback = js.native
  def apply(logdir: String): TensorBoardCallback = js.native
  def apply(logdir: String, args: TensorBoardCallbackArgs): TensorBoardCallback = js.native
}

