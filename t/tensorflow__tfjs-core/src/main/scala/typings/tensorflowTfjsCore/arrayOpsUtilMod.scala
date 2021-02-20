package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayOpsUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/array_ops_util", "getPermuted")
  @js.native
  def getPermuted(reshapedRank: Double, blockShapeRank: Double): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/array_ops_util", "getPermuted")
  @js.native
  def getPermuted(reshapedRank: Double, blockShapeRank: Double, batchToSpace: Boolean): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/array_ops_util", "getReshaped")
  @js.native
  def getReshaped(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/array_ops_util", "getReshaped")
  @js.native
  def getReshaped(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double, batchToSpace: Boolean): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/array_ops_util", "getReshapedPermuted")
  @js.native
  def getReshapedPermuted(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/array_ops_util", "getReshapedPermuted")
  @js.native
  def getReshapedPermuted(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double, batchToSpace: Boolean): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/array_ops_util", "getSliceBeginCoords")
  @js.native
  def getSliceBeginCoords(crops: js.Array[js.Array[Double]], blockShape: Double): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/array_ops_util", "getSliceSize")
  @js.native
  def getSliceSize(uncroppedShape: js.Array[Double], crops: js.Array[js.Array[Double]], blockShape: Double): js.Array[Double] = js.native
}
