package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "slice_util")
@js.native
object slice_util extends js.Object {
  def assertParamsValid(
    input: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
    begin: js.Array[Double],
    size: js.Array[Double]
  ): Unit = js.native
  def computeFlatOffset(begin: js.Array[Double], strides: js.Array[Double]): Double = js.native
  def computeOutShape(begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double]): js.Array[Double] = js.native
  def isSliceContinous(shape: js.Array[Double], begin: js.Array[Double], size: js.Array[Double]): Boolean = js.native
  def maskToAxes(mask: Double): js.Array[Double] = js.native
  def startForAxis(
    beginMask: Double,
    startIndices: js.Array[Double],
    strides: js.Array[Double],
    inputShape: js.Array[Double],
    axis: Double
  ): Double = js.native
  def stopForAxis(
    endMask: Double,
    stopIndices: js.Array[Double],
    strides: js.Array[Double],
    inputShape: js.Array[Double],
    axis: Double
  ): Double = js.native
}

