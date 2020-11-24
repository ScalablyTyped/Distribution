package typings.tensorflowTfjsCore.opsForConverterMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TensorLike3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor3d")
@js.native
object tensor3d extends js.Object {
  
  def apply(values: TensorLike3D): Tensor3D = js.native
  def apply(values: TensorLike3D, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor3D = js.native
  def apply(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double]): Tensor3D = js.native
  def apply(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double], dtype: DataType): Tensor3D = js.native
}
