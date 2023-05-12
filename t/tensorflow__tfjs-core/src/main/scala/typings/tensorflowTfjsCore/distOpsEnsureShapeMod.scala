package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsEnsureShapeMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ensure_shape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensureShape[R /* <: Rank */](
    x: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureShape")(x.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
}
