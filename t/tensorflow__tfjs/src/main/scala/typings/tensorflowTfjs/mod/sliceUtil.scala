package typings.tensorflowTfjs.mod

import typings.tensorflowTfjsCore.anon.Begin
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliceUtil {
  
  @JSImport("@tensorflow/tfjs", "slice_util")
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertParamsValid(input: TensorInfo, begin: js.Array[Double], size: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertParamsValid")(input.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def computeFlatOffset(begin: js.Array[Double], strides: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeFlatOffset")(begin.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def computeOutShape(begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOutShape")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getNormalizedAxes(
    inputShape: js.Array[Double],
    ellipsisAxes: js.Array[Double],
    numInterpolatedAxes: Double,
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: Double,
    ellipsisMask: Double
  ): Begin = (^.asInstanceOf[js.Dynamic].applyDynamic("getNormalizedAxes")(inputShape.asInstanceOf[js.Any], ellipsisAxes.asInstanceOf[js.Any], numInterpolatedAxes.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], beginMask.asInstanceOf[js.Any], endMask.asInstanceOf[js.Any], ellipsisMask.asInstanceOf[js.Any])).asInstanceOf[Begin]
  
  inline def isSliceContinous(shape: js.Array[Double], begin: js.Array[Double], size: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSliceContinous")(shape.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def maskToAxes(mask: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("maskToAxes")(mask.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def parseSliceParams(x: TensorInfo, begin: js.Array[Double]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSliceParams")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  inline def parseSliceParams(x: TensorInfo, begin: js.Array[Double], size: js.Array[Double]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSliceParams")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  inline def parseSliceParams(x: TensorInfo, begin: js.Array[Double], size: Double): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSliceParams")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  inline def parseSliceParams(x: TensorInfo, begin: Double): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSliceParams")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  inline def parseSliceParams(x: TensorInfo, begin: Double, size: js.Array[Double]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSliceParams")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  inline def parseSliceParams(x: TensorInfo, begin: Double, size: Double): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSliceParams")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  
  inline def startForAxis(
    beginMask: Double,
    startIndices: js.Array[Double],
    strides: js.Array[Double],
    inputShape: js.Array[Double],
    axis: Double,
    ellipsisMask: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startForAxis")(beginMask.asInstanceOf[js.Any], startIndices.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], ellipsisMask.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def startIndicesWithElidedDims(
    beginMask: Double,
    ellipsisInsertionIndex: Double,
    numElidedAxes: Double,
    originalBegin: js.Array[Double],
    inputShape: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("startIndicesWithElidedDims")(beginMask.asInstanceOf[js.Any], ellipsisInsertionIndex.asInstanceOf[js.Any], numElidedAxes.asInstanceOf[js.Any], originalBegin.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def stopForAxis(
    endMask: Double,
    stopIndices: js.Array[Double],
    strides: js.Array[Double],
    inputShape: js.Array[Double],
    axis: Double,
    ellipsisMask: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("stopForAxis")(endMask.asInstanceOf[js.Any], stopIndices.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], ellipsisMask.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def stopIndicesWithElidedDims(
    endMask: Double,
    ellipsisInsertionIndex: Double,
    numElidedAxes: Double,
    originalEnd: js.Array[Double],
    inputShape: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("stopIndicesWithElidedDims")(endMask.asInstanceOf[js.Any], ellipsisInsertionIndex.asInstanceOf[js.Any], numElidedAxes.asInstanceOf[js.Any], originalEnd.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def stridesForAxis(strides: js.Array[Double], axis: Double, ellipsisMask: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("stridesForAxis")(strides.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], ellipsisMask.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def stridesWithElidedDims(
    strides: js.Array[Double],
    ellipsisInsertionIndex: Double,
    numElidedAxes: Double,
    inputShape: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("stridesWithElidedDims")(strides.asInstanceOf[js.Any], ellipsisInsertionIndex.asInstanceOf[js.Any], numElidedAxes.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
