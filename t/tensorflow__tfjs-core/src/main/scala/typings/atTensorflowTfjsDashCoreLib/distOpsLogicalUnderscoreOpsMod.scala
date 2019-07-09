package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/logical_ops", JSImport.Namespace)
@js.native
object distOpsLogicalUnderscoreOpsMod extends js.Object {
  val whereAsync: js.Function1[
    /* condition */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    js.Promise[atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D]
  ] = js.native
  @js.native
  object logicalAnd extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      a: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      a: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): T = js.native
  }
  
  @js.native
  object logicalNot extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  }
  
  @js.native
  object logicalOr extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      a: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      a: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): T = js.native
  }
  
  @js.native
  object logicalXor extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      a: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      b: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      a: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): T = js.native
  }
  
  @js.native
  object where extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      condition: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      a: T,
      b: T
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      condition: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      a: T,
      b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      condition: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      a: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      b: T
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      condition: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      a: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](condition: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, a: T, b: T): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      condition: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      a: T,
      b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      condition: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      a: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      b: T
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      condition: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      a: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): T = js.native
  }
  
}

