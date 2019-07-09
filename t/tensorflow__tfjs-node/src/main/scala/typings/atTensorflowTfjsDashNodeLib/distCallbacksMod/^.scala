package typings
package atTensorflowTfjsDashNodeLib.distCallbacksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/callbacks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getDisplayDecimalPlaces(x: scala.Double): scala.Double = js.native
  def getSuccinctNumberDisplay(x: scala.Double): java.lang.String = js.native
  def tensorBoard(): TensorBoardCallback = js.native
  def tensorBoard(logdir: java.lang.String): TensorBoardCallback = js.native
  def tensorBoard(logdir: java.lang.String, args: TensorBoardCallbackArgs): TensorBoardCallback = js.native
}

