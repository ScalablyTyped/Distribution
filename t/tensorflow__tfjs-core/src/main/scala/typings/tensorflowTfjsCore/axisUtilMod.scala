package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axisUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/axis_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertAxesAreInnerMostDims(msg: String, axes: js.Array[Double], rank: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertAxesAreInnerMostDims")(msg.asInstanceOf[js.Any], axes.asInstanceOf[js.Any], rank.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def axesAreInnerMostDims(axes: js.Array[Double], rank: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("axesAreInnerMostDims")(axes.asInstanceOf[js.Any], rank.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def combineLocations(outputLoc: js.Array[Double], reduceLoc: js.Array[Double], axes: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLocations")(outputLoc.asInstanceOf[js.Any], reduceLoc.asInstanceOf[js.Any], axes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def computeOutAndReduceShapes(aShape: js.Array[Double], axes: js.Array[Double]): js.Tuple2[js.Array[Double], js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOutAndReduceShapes")(aShape.asInstanceOf[js.Any], axes.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Double], js.Array[Double]]]
  
  inline def expandShapeToKeepDim(shape: js.Array[Double], axes: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("expandShapeToKeepDim")(shape.asInstanceOf[js.Any], axes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getAxesPermutation(axes: js.Array[Double], rank: Double): js.Array[Double] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxesPermutation")(axes.asInstanceOf[js.Any], rank.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double] | Null]
  
  inline def getInnerMostAxes(numAxes: Double, rank: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInnerMostAxes")(numAxes.asInstanceOf[js.Any], rank.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getUndoAxesPermutation(axes: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUndoAxesPermutation")(axes.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
