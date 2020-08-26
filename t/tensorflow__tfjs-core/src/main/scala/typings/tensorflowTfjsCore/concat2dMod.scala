package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/concat_2d", JSImport.Namespace)
@js.native
object concat2dMod extends js.Object {
  val concat2d: js.Function2[/* tensors */ js.Array[Tensor2D | TensorLike], /* axis */ Double, Tensor2D] = js.native
}

