package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensorMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor", "tensor")
  @js.native
  def tensor[R /* <: Rank */](values: TensorLike): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor", "tensor")
  @js.native
  def tensor[R /* <: Rank */](values: TensorLike, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor", "tensor")
  @js.native
  def tensor[R /* <: Rank */](
    values: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor", "tensor")
  @js.native
  def tensor[R /* <: Rank */](
    values: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = js.native
}
