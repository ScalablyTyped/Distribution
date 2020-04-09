package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/one_hot", JSImport.Namespace)
@js.native
object oneHotMod extends js.Object {
  val oneHot: js.Function4[
    /* indices */ Tensor[Rank] | TensorLike, 
    /* depth */ Double, 
    /* onValue */ js.UndefOr[Double], 
    /* offValue */ js.UndefOr[Double], 
    Tensor[Rank]
  ] = js.native
}

