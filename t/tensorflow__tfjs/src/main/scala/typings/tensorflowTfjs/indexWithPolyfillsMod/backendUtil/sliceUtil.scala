package typings.tensorflowTfjs.indexWithPolyfillsMod.backendUtil

import typings.tensorflowTfjsCore.anon.Begin
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "backend_util.slice_util")
@js.native
object sliceUtil extends js.Object {
  
  def assertParamsValid(input: TensorInfo, begin: js.Array[Double], size: js.Array[Double]): Unit = js.native
  
  def computeFlatOffset(begin: js.Array[Double], strides: js.Array[Double]): Double = js.native
  
  def computeOutShape(begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double]): js.Array[Double] = js.native
  
  def getNormalizedAxes(
    inputShape: js.Array[Double],
    ellipsisAxes: js.Array[Double],
    numInterpolatedAxes: Double,
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: Double,
    ellipsisMask: Double
  ): Begin = js.native
  
  def isSliceContinous(shape: js.Array[Double], begin: js.Array[Double], size: js.Array[Double]): Boolean = js.native
  
  def maskToAxes(mask: Double): js.Array[Double] = js.native
  
  def parseSliceParams(x: TensorInfo, begin: js.Array[Double]): js.Array[js.Array[Double]] = js.native
  def parseSliceParams(x: TensorInfo, begin: js.Array[Double], size: js.Array[Double]): js.Array[js.Array[Double]] = js.native
  def parseSliceParams(x: TensorInfo, begin: js.Array[Double], size: Double): js.Array[js.Array[Double]] = js.native
  def parseSliceParams(x: TensorInfo, begin: Double): js.Array[js.Array[Double]] = js.native
  def parseSliceParams(x: TensorInfo, begin: Double, size: js.Array[Double]): js.Array[js.Array[Double]] = js.native
  def parseSliceParams(x: TensorInfo, begin: Double, size: Double): js.Array[js.Array[Double]] = js.native
  
  def startForAxis(
    beginMask: Double,
    startIndices: js.Array[Double],
    strides: js.Array[Double],
    inputShape: js.Array[Double],
    axis: Double,
    ellipsisMask: Double
  ): Double = js.native
  
  def startIndicesWithElidedDims(
    beginMask: Double,
    ellipsisInsertionIndex: Double,
    numElidedAxes: Double,
    originalBegin: js.Array[Double],
    inputShape: js.Array[Double]
  ): js.Array[Double] = js.native
  
  def stopForAxis(
    endMask: Double,
    stopIndices: js.Array[Double],
    strides: js.Array[Double],
    inputShape: js.Array[Double],
    axis: Double,
    ellipsisMask: Double
  ): Double = js.native
  
  def stopIndicesWithElidedDims(
    endMask: Double,
    ellipsisInsertionIndex: Double,
    numElidedAxes: Double,
    originalEnd: js.Array[Double],
    inputShape: js.Array[Double]
  ): js.Array[Double] = js.native
  
  def stridesForAxis(strides: js.Array[Double], axis: Double, ellipsisMask: Double): Double = js.native
  
  def stridesWithElidedDims(
    strides: js.Array[Double],
    ellipsisInsertionIndex: Double,
    numElidedAxes: Double,
    inputShape: js.Array[Double]
  ): js.Array[Double] = js.native
}
