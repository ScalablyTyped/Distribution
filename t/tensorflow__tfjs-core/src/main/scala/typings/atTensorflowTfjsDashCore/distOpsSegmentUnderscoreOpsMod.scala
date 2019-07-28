package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/segment_ops", JSImport.Namespace)
@js.native
object distOpsSegmentUnderscoreOpsMod extends js.Object {
  @js.native
  object gather extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T, indices: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, indices: Tensor[Rank], axis: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, indices: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, indices: TensorLike, axis: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, indices: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, indices: Tensor[Rank], axis: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, indices: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, indices: TensorLike, axis: Double): T = js.native
  }
  
  @js.native
  object unsortedSegmentSum extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T, segmentIds: Tensor1D, numSegments: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, segmentIds: TensorLike, numSegments: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, segmentIds: Tensor1D, numSegments: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, segmentIds: TensorLike, numSegments: Double): T = js.native
  }
  
}

