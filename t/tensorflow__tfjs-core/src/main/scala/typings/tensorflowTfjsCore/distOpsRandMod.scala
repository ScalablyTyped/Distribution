package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsRandMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/rand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rand[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    randFunction: js.Function0[Double]
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("rand")(shape.asInstanceOf[js.Any], randFunction.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def rand[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    randFunction: js.Function0[Double],
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("rand")(shape.asInstanceOf[js.Any], randFunction.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
}
