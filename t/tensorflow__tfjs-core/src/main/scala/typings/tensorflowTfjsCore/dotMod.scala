package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/dot", JSImport.Namespace)
@js.native
object dotMod extends js.Object {
  val dot: js.Function2[/* t1 */ Tensor[Rank] | TensorLike, /* t2 */ Tensor[Rank] | TensorLike, Tensor[Rank]] = js.native
}

