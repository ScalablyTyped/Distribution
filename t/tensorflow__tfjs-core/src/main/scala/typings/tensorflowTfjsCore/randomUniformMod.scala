package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomUniformMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/random_uniform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: Unit,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: DataType,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: DataType,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Unit,
    dtype: Unit,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Unit,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Unit,
    dtype: DataType,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Unit,
    dtype: DataType,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Double,
    dtype: Unit,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Double,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Double,
    dtype: DataType,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Double,
    dtype: DataType,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Unit,
    dtype: Unit,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Unit,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Unit,
    dtype: DataType,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Unit,
    dtype: DataType,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
}
