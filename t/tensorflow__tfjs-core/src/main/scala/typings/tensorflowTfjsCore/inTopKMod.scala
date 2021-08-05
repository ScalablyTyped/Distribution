package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inTopKMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/in_top_k", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T | TensorLike, targets: TensorLike | U): js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("inTopKAsync")(predictions.asInstanceOf[js.Any], targets.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U]]
  inline def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T | TensorLike, targets: TensorLike | U, k: Double): js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("inTopKAsync")(predictions.asInstanceOf[js.Any], targets.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U]]
}
