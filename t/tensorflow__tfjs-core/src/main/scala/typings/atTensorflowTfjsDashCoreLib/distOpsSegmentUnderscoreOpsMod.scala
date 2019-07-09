package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/segment_ops", JSImport.Namespace)
@js.native
object distOpsSegmentUnderscoreOpsMod extends js.Object {
  @js.native
  object gather extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: T,
      indices: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: T,
      indices: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      axis: scala.Double
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, indices: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, indices: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, axis: scala.Double): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      indices: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      indices: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      axis: scala.Double
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      indices: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      indices: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      axis: scala.Double
    ): T = js.native
  }
  
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
  
}

