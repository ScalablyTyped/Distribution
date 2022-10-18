package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsLowerBoundMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/lower_bound", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lowerBound(sortedSequence: Tensor[Rank], values: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(sortedSequence.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def lowerBound(sortedSequence: Tensor[Rank], values: TensorLike): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(sortedSequence.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def lowerBound(sortedSequence: TensorLike, values: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(sortedSequence.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def lowerBound(sortedSequence: TensorLike, values: TensorLike): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(sortedSequence.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
}
