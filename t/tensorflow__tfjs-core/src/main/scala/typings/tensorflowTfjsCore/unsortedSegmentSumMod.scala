package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unsortedSegmentSumMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/unsorted_segment_sum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: T | TensorLike, segmentIds: Tensor1D, numSegments: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unsortedSegmentSum")(x.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any], numSegments.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: T | TensorLike, segmentIds: TensorLike, numSegments: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unsortedSegmentSum")(x.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any], numSegments.asInstanceOf[js.Any])).asInstanceOf[T]
}
