package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsArrayOpsUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/array_ops_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPermuted(reshapedRank: Double, blockShapeRank: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPermuted")(reshapedRank.asInstanceOf[js.Any], blockShapeRank.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getPermuted(reshapedRank: Double, blockShapeRank: Double, batchToSpace: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPermuted")(reshapedRank.asInstanceOf[js.Any], blockShapeRank.asInstanceOf[js.Any], batchToSpace.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getReshaped(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getReshaped")(inputShape.asInstanceOf[js.Any], blockShape.asInstanceOf[js.Any], prod.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getReshaped(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double, batchToSpace: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getReshaped")(inputShape.asInstanceOf[js.Any], blockShape.asInstanceOf[js.Any], prod.asInstanceOf[js.Any], batchToSpace.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getReshapedPermuted(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getReshapedPermuted")(inputShape.asInstanceOf[js.Any], blockShape.asInstanceOf[js.Any], prod.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getReshapedPermuted(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double, batchToSpace: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getReshapedPermuted")(inputShape.asInstanceOf[js.Any], blockShape.asInstanceOf[js.Any], prod.asInstanceOf[js.Any], batchToSpace.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getSliceBeginCoords(crops: js.Array[js.Array[Double]], blockShape: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSliceBeginCoords")(crops.asInstanceOf[js.Any], blockShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getSliceSize(uncroppedShape: js.Array[Double], crops: js.Array[js.Array[Double]], blockShape: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSliceSize")(uncroppedShape.asInstanceOf[js.Any], crops.asInstanceOf[js.Any], blockShape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
