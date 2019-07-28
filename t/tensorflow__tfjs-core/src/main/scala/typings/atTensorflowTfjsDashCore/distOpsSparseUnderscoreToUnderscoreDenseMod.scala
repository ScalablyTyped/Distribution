package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTensorMod.Scalar
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.ScalarLike
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/sparse_to_dense", JSImport.Namespace)
@js.native
object distOpsSparseUnderscoreToUnderscoreDenseMod extends js.Object {
  @js.native
  object sparseToDense extends js.Object {
    def apply[R /* <: Rank */](
      sparseIndices: Tensor[Rank],
      sparseValues: Tensor[Rank],
      outputShape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: Tensor[Rank],
      sparseValues: Tensor[Rank],
      outputShape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      defaultValue: Scalar
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: Tensor[Rank],
      sparseValues: Tensor[Rank],
      outputShape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      defaultValue: ScalarLike
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: Tensor[Rank],
      sparseValues: TensorLike,
      outputShape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: Tensor[Rank],
      sparseValues: TensorLike,
      outputShape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      defaultValue: Scalar
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: Tensor[Rank],
      sparseValues: TensorLike,
      outputShape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      defaultValue: ScalarLike
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: TensorLike,
      sparseValues: Tensor[Rank],
      outputShape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: TensorLike,
      sparseValues: Tensor[Rank],
      outputShape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      defaultValue: Scalar
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: TensorLike,
      sparseValues: Tensor[Rank],
      outputShape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      defaultValue: ScalarLike
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: TensorLike,
      sparseValues: TensorLike,
      outputShape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: TensorLike,
      sparseValues: TensorLike,
      outputShape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      defaultValue: Scalar
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      sparseIndices: TensorLike,
      sparseValues: TensorLike,
      outputShape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      defaultValue: ScalarLike
    ): Tensor[R] = js.native
  }
  
}

