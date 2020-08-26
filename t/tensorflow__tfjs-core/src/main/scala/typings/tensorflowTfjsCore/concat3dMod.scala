package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/concat_3d", JSImport.Namespace)
@js.native
object concat3dMod extends js.Object {
  val concat3d: js.Function2[/* tensors */ js.Array[Tensor3D | TensorLike], /* axis */ Double, Tensor3D] = js.native
}

