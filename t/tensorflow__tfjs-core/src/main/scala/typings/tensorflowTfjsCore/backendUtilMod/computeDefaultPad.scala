package typings.tensorflowTfjsCore.backendUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/backend_util", "computeDefaultPad")
@js.native
object computeDefaultPad extends js.Object {
  def apply(inputShape: js.Tuple2[Double, Double], fieldSize: Double, stride: Double): Double = js.native
  def apply(inputShape: js.Tuple2[Double, Double], fieldSize: Double, stride: Double, dilation: Double): Double = js.native
  def apply(inputShape: js.Tuple4[Double, Double, Double, Double], fieldSize: Double, stride: Double): Double = js.native
  def apply(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    fieldSize: Double,
    stride: Double,
    dilation: Double
  ): Double = js.native
}

