package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsSpaceToBatchNdMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/space_to_batch_nd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def spaceToBatchND[T /* <: Tensor[Rank] */](x: T | TensorLike, blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("spaceToBatchND")(x.asInstanceOf[js.Any], blockShape.asInstanceOf[js.Any], paddings.asInstanceOf[js.Any])).asInstanceOf[T]
}
