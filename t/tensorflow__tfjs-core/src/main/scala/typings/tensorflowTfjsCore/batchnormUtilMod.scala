package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/batchnorm_util", JSImport.Namespace)
@js.native
object batchnormUtilMod extends js.Object {
  def xAs4D[R /* <: Rank */](x: Tensor[R]): Tensor[R4] = js.native
}

