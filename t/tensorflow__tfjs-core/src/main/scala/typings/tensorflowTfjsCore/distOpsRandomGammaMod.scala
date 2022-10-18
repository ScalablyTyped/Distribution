package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsRandomGammaMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/random_gamma", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double,
    dtype: float32 | int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double,
    dtype: float32 | int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Unit,
    dtype: float32 | int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Unit,
    dtype: float32 | int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
}
