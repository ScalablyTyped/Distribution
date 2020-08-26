package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/random_gamma", JSImport.Namespace)
@js.native
object randomGammaMod extends js.Object {
  @js.native
  object randomGamma extends js.Object {
    def apply[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      alpha: Double
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      alpha: Double,
      beta: js.UndefOr[scala.Nothing],
      dtype: js.UndefOr[scala.Nothing],
      seed: Double
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      alpha: Double,
      beta: js.UndefOr[scala.Nothing],
      dtype: float32
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      alpha: Double,
      beta: js.UndefOr[scala.Nothing],
      dtype: float32,
      seed: Double
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      alpha: Double,
      beta: js.UndefOr[scala.Nothing],
      dtype: int32
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      alpha: Double,
      beta: js.UndefOr[scala.Nothing],
      dtype: int32,
      seed: Double
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      alpha: Double,
      beta: Double
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      alpha: Double,
      beta: Double,
      dtype: js.UndefOr[scala.Nothing],
      seed: Double
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      alpha: Double,
      beta: Double,
      dtype: float32
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      alpha: Double,
      beta: Double,
      dtype: float32,
      seed: Double
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      alpha: Double,
      beta: Double,
      dtype: int32
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      alpha: Double,
      beta: Double,
      dtype: int32,
      seed: Double
    ): Tensor[R] = js.native
  }
  
}

