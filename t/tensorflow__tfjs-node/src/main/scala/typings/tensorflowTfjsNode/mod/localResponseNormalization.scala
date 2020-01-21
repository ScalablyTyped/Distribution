package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "localResponseNormalization")
@js.native
object localResponseNormalization extends js.Object {
  def apply(x: Tensor[R3 | R4]): Tensor[R3] = js.native
  def apply(x: Tensor[R3 | R4], depthRadius: Double): Tensor[R3] = js.native
  def apply(x: Tensor[R3 | R4], depthRadius: Double, bias: Double): Tensor[R3] = js.native
  def apply(x: Tensor[R3 | R4], depthRadius: Double, bias: Double, alpha: Double): Tensor[R3] = js.native
  def apply(x: Tensor[R3 | R4], depthRadius: Double, bias: Double, alpha: Double, beta: Double): Tensor[R3] = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: Double, alpha: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: Double, alpha: Double, beta: Double): T = js.native
}

