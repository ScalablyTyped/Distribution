package typings.tensorflowTfjs.mod.backendUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "backend_util.getReshaped")
@js.native
object getReshaped extends js.Object {
  def apply(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double): js.Array[Double] = js.native
  def apply(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double, batchToSpace: Boolean): js.Array[Double] = js.native
}

