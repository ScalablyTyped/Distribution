package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "unsortedSegmentSum")
@js.native
object unsortedSegmentSum extends js.Object {
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] */](x: T, segmentIds: Tensor1D, numSegments: Double): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] */](x: T, segmentIds: TensorLike, numSegments: Double): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] */](x: TensorLike, segmentIds: Tensor1D, numSegments: Double): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] */](x: TensorLike, segmentIds: TensorLike, numSegments: Double): T = js.native
}

