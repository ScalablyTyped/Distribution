package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.X
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/reduction_ops_util", JSImport.Namespace)
@js.native
object reductionOpsUtilMod extends js.Object {
  def gradForMinAndMax[T /* <: Tensor[Rank] */](dy: T, y: T, xOrig: Tensor[Rank], origAxes: js.Array[Double], permutedAxes: js.Array[Double]): X = js.native
}

