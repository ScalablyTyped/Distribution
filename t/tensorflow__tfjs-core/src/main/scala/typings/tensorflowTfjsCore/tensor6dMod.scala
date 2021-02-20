package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor6D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TensorLike6D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensor6dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor6d", "tensor6d")
  @js.native
  def tensor6d(values: TensorLike6D): Tensor6D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor6d", "tensor6d")
  @js.native
  def tensor6d(values: TensorLike6D, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor6D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor6d", "tensor6d")
  @js.native
  def tensor6d(values: TensorLike6D, shape: js.Tuple6[Double, Double, Double, Double, Double, Double]): Tensor6D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor6d", "tensor6d")
  @js.native
  def tensor6d(
    values: TensorLike6D,
    shape: js.Tuple6[Double, Double, Double, Double, Double, Double],
    dtype: DataType
  ): Tensor6D = js.native
}
