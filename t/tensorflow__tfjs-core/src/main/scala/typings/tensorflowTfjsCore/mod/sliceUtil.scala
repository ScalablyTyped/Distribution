package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "slice_util")
@js.native
object sliceUtil extends js.Object {
  def assertParamsValid(
    input: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
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
    axis: Double,
    ellipsisMask: Double
  ): Double = js.native
  def startIndicesWithElidedDims(startIndices: js.Array[Double], ellipsisInsertionIndex: Double, numElidedAxes: Double): js.Array[Double] = js.native
  def stopForAxis(
    endMask: Double,
    stopIndices: js.Array[Double],
    strides: js.Array[Double],
    inputShape: js.Array[Double],
    axis: Double,
    ellipsisMask: Double
  ): Double = js.native
  def stopIndicesWithElidedDims(
    stopIndices: js.Array[Double],
    ellipsisInsertionIndex: Double,
    numElidedAxes: Double,
    inputShape: js.Array[Double]
  ): js.Array[Double] = js.native
  def stridesForAxis(strides: js.Array[Double], axis: Double, ellipsisMask: Double): Double = js.native
  def stridesWithElidedDims(strides: js.Array[Double], ellipsisInsertionIndex: Double, numElidedAxes: Double): js.Array[Double] = js.native
}

