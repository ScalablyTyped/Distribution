package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TensorLike2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/tensor2d", JSImport.Namespace)
@js.native
object tensor2dMod extends js.Object {
  
  def tensor2d(values: TensorLike2D): Tensor2D = js.native
  def tensor2d(values: TensorLike2D, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor2D = js.native
  def tensor2d(values: TensorLike2D, shape: js.Tuple2[Double, Double]): Tensor2D = js.native
  def tensor2d(values: TensorLike2D, shape: js.Tuple2[Double, Double], dtype: DataType): Tensor2D = js.native
}
