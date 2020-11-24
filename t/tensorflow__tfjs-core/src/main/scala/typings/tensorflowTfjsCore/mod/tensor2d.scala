package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TensorLike2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "tensor2d")
@js.native
object tensor2d extends js.Object {
  
  def apply(values: TensorLike2D): Tensor2D = js.native
  def apply(values: TensorLike2D, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor2D = js.native
  def apply(values: TensorLike2D, shape: js.Tuple2[Double, Double]): Tensor2D = js.native
  def apply(values: TensorLike2D, shape: js.Tuple2[Double, Double], dtype: DataType): Tensor2D = js.native
}
