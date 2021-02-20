package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor5D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TensorLike5D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensor5dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor5d", "tensor5d")
  @js.native
  def tensor5d(values: TensorLike5D): Tensor5D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor5d", "tensor5d")
  @js.native
  def tensor5d(values: TensorLike5D, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor5D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor5d", "tensor5d")
  @js.native
  def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double]): Tensor5D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor5d", "tensor5d")
  @js.native
  def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double], dtype: DataType): Tensor5D = js.native
}
