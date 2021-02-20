package typings.tensorflowTfjs.mod

import typings.tensorflowTfjsCore.anon.Begin
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliceUtil {
  
  @JSImport("@tensorflow/tfjs", "slice_util.assertParamsValid")
  @js.native
  def assertParamsValid(input: TensorInfo, begin: js.Array[Double], size: js.Array[Double]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs", "slice_util.computeFlatOffset")
  @js.native
  def computeFlatOffset(begin: js.Array[Double], strides: js.Array[Double]): Double = js.native
  
  @JSImport("@tensorflow/tfjs", "slice_util.computeOutShape")
  @js.native
  def computeOutShape(begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "slice_util.getNormalizedAxes")
  @js.native
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
  
  @JSImport("@tensorflow/tfjs", "slice_util.isSliceContinous")
  @js.native
  def isSliceContinous(shape: js.Array[Double], begin: js.Array[Double], size: js.Array[Double]): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs", "slice_util.maskToAxes")
  @js.native
  def maskToAxes(mask: Double): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "slice_util.parseSliceParams")
  @js.native
  def parseSliceParams(x: TensorInfo, begin: js.Array[Double]): js.Array[js.Array[Double]] = js.native
  @JSImport("@tensorflow/tfjs", "slice_util.parseSliceParams")
  @js.native
  def parseSliceParams(x: TensorInfo, begin: js.Array[Double], size: js.Array[Double]): js.Array[js.Array[Double]] = js.native
  @JSImport("@tensorflow/tfjs", "slice_util.parseSliceParams")
  @js.native
  def parseSliceParams(x: TensorInfo, begin: js.Array[Double], size: Double): js.Array[js.Array[Double]] = js.native
  @JSImport("@tensorflow/tfjs", "slice_util.parseSliceParams")
  @js.native
  def parseSliceParams(x: TensorInfo, begin: Double): js.Array[js.Array[Double]] = js.native
  @JSImport("@tensorflow/tfjs", "slice_util.parseSliceParams")
  @js.native
  def parseSliceParams(x: TensorInfo, begin: Double, size: js.Array[Double]): js.Array[js.Array[Double]] = js.native
  @JSImport("@tensorflow/tfjs", "slice_util.parseSliceParams")
  @js.native
  def parseSliceParams(x: TensorInfo, begin: Double, size: Double): js.Array[js.Array[Double]] = js.native
  
  @JSImport("@tensorflow/tfjs", "slice_util.startForAxis")
  @js.native
  def startForAxis(
    beginMask: Double,
    startIndices: js.Array[Double],
    strides: js.Array[Double],
    inputShape: js.Array[Double],
    axis: Double,
    ellipsisMask: Double
  ): Double = js.native
  
  @JSImport("@tensorflow/tfjs", "slice_util.startIndicesWithElidedDims")
  @js.native
  def startIndicesWithElidedDims(
    beginMask: Double,
    ellipsisInsertionIndex: Double,
    numElidedAxes: Double,
    originalBegin: js.Array[Double],
    inputShape: js.Array[Double]
  ): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "slice_util.stopForAxis")
  @js.native
  def stopForAxis(
    endMask: Double,
    stopIndices: js.Array[Double],
    strides: js.Array[Double],
    inputShape: js.Array[Double],
    axis: Double,
    ellipsisMask: Double
  ): Double = js.native
  
  @JSImport("@tensorflow/tfjs", "slice_util.stopIndicesWithElidedDims")
  @js.native
  def stopIndicesWithElidedDims(
    endMask: Double,
    ellipsisInsertionIndex: Double,
    numElidedAxes: Double,
    originalEnd: js.Array[Double],
    inputShape: js.Array[Double]
  ): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "slice_util.stridesForAxis")
  @js.native
  def stridesForAxis(strides: js.Array[Double], axis: Double, ellipsisMask: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs", "slice_util.stridesWithElidedDims")
  @js.native
  def stridesWithElidedDims(
    strides: js.Array[Double],
    ellipsisInsertionIndex: Double,
    numElidedAxes: Double,
    inputShape: js.Array[Double]
  ): js.Array[Double] = js.native
}
