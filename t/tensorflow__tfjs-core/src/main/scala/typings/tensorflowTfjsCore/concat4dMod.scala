package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/concat_4d", JSImport.Namespace)
@js.native
object concat4dMod extends js.Object {
  val concat4d: js.Function2[/* tensors */ js.Array[Tensor4D | TensorLike], /* axis */ Double, Tensor4D] = js.native
}

