package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.ScalarLike
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Scalar
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/sparse_to_dense", JSImport.Namespace)
@js.native
object sparseToDenseMod extends js.Object {
  @js.native
  object sparseToDense extends js.Object {
    def apply[R /* <: Rank */](
      sparseIndices: TensorLike,
      sparseValues: TensorLike,
      outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: TensorLike,
      sparseValues: TensorLike,
      outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      defaultValue: ScalarLike
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: TensorLike,
      sparseValues: TensorLike,
      outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      defaultValue: Scalar
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: TensorLike,
      sparseValues: Tensor[Rank],
      outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: TensorLike,
      sparseValues: Tensor[Rank],
      outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      defaultValue: ScalarLike
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: TensorLike,
      sparseValues: Tensor[Rank],
      outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      defaultValue: Scalar
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: Tensor[Rank],
      sparseValues: TensorLike,
      outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: Tensor[Rank],
      sparseValues: TensorLike,
      outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      defaultValue: ScalarLike
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: Tensor[Rank],
      sparseValues: TensorLike,
      outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      defaultValue: Scalar
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: Tensor[Rank],
      sparseValues: Tensor[Rank],
      outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: Tensor[Rank],
      sparseValues: Tensor[Rank],
      outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      defaultValue: ScalarLike
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: Tensor[Rank],
      sparseValues: Tensor[Rank],
      outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      defaultValue: Scalar
    ): Tensor[R] = js.native
  }
  
}

