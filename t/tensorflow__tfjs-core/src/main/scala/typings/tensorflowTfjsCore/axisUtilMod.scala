package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axisUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/axis_util", "assertAxesAreInnerMostDims")
  @js.native
  def assertAxesAreInnerMostDims(msg: String, axes: js.Array[Double], rank: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/axis_util", "axesAreInnerMostDims")
  @js.native
  def axesAreInnerMostDims(axes: js.Array[Double], rank: Double): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/axis_util", "combineLocations")
  @js.native
  def combineLocations(outputLoc: js.Array[Double], reduceLoc: js.Array[Double], axes: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/axis_util", "computeOutAndReduceShapes")
  @js.native
  def computeOutAndReduceShapes(aShape: js.Array[Double], axes: js.Array[Double]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/axis_util", "expandShapeToKeepDim")
  @js.native
  def expandShapeToKeepDim(shape: js.Array[Double], axes: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/axis_util", "getAxesPermutation")
  @js.native
  def getAxesPermutation(axes: js.Array[Double], rank: Double): js.Array[Double] | Null = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/axis_util", "getInnerMostAxes")
  @js.native
  def getInnerMostAxes(numAxes: Double, rank: Double): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/axis_util", "getUndoAxesPermutation")
  @js.native
  def getUndoAxesPermutation(axes: js.Array[Double]): js.Array[Double] = js.native
}
