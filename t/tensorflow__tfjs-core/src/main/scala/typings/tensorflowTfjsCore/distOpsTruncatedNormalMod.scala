package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsTruncatedNormalMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/truncated_normal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: float32 | int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: float32 | int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: float32 | int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: float32 | int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: float32 | int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: float32 | int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: float32 | int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: float32 | int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
}
