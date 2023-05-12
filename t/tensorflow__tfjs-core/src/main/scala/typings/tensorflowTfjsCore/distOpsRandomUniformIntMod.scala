package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsRandomUniformIntMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/random_uniform_int", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def randomUniformInt[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniformInt")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniformInt[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniformInt")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniformInt[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniformInt")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
}
