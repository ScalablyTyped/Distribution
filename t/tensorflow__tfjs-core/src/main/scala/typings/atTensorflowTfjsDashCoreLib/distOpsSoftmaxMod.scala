package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/softmax", JSImport.Namespace)
@js.native
object distOpsSoftmaxMod extends js.Object {
  @js.native
  object logSoftmax extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](logits: T): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](logits: T, axis: scala.Double): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, axis: scala.Double): T = js.native
  }
  
  @js.native
  object softmax extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](logits: T): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](logits: T, dim: scala.Double): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, dim: scala.Double): T = js.native
  }
  
}

