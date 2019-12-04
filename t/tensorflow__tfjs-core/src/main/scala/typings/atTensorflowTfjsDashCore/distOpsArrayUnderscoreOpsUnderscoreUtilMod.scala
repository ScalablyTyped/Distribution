package typings.atTensorflowTfjsDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/array_ops_util", JSImport.Namespace)
@js.native
object distOpsArrayUnderscoreOpsUnderscoreUtilMod extends js.Object {
  def getPermuted(reshapedRank: Double, blockShapeRank: Double): js.Array[Double] = js.native
  def getPermuted(reshapedRank: Double, blockShapeRank: Double, batchToSpace: Boolean): js.Array[Double] = js.native
  def getReshaped(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double): js.Array[Double] = js.native
  def getReshaped(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double, batchToSpace: Boolean): js.Array[Double] = js.native
  def getReshapedPermuted(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double): js.Array[Double] = js.native
  def getReshapedPermuted(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double, batchToSpace: Boolean): js.Array[Double] = js.native
  def getSliceBeginCoords(crops: js.Array[js.Array[Double]], blockShape: Double): js.Array[Double] = js.native
  def getSliceSize(uncroppedShape: js.Array[Double], crops: js.Array[js.Array[Double]], blockShape: Double): js.Array[Double] = js.native
}

