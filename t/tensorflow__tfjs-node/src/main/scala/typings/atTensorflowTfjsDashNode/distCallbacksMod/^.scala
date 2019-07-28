package typings.atTensorflowTfjsDashNode.distCallbacksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/callbacks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getDisplayDecimalPlaces(x: Double): Double = js.native
  def getSuccinctNumberDisplay(x: Double): String = js.native
  def tensorBoard(): TensorBoardCallback = js.native
  def tensorBoard(logdir: String): TensorBoardCallback = js.native
  def tensorBoard(logdir: String, args: TensorBoardCallbackArgs): TensorBoardCallback = js.native
}

