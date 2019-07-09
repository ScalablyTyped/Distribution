package typings
package atTensorflowTfjsDashCoreLib.distOpsOpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "unsortedSegmentSum")
@js.native
object unsortedSegmentSum extends js.Object {
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, segmentIds: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D, numSegments: scala.Double): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, segmentIds: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, numSegments: scala.Double): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    segmentIds: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D,
    numSegments: scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    segmentIds: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    numSegments: scala.Double
  ): T = js.native
}

