package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "localResponseNormalization")
@js.native
object localResponseNormalization extends js.Object {
  def apply[T /* <: Tensor3D | Tensor4D */](x: T): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: T, depthRadius: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: T, depthRadius: Double, bias: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: T, depthRadius: Double, bias: Double, alpha: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: T, depthRadius: Double, bias: Double, alpha: Double, beta: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: Double, alpha: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: Double, alpha: Double, beta: Double): T = js.native
}

