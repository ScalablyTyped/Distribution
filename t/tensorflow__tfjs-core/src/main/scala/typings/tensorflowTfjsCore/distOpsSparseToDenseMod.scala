package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.ScalarLike
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsSparseToDenseMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/sparse_to_dense", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
}
