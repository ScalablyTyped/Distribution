package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/matmul", JSImport.Namespace)
@js.native
object distOpsMatmulMod extends js.Object {
  val dot: js.Function2[
    /* t1 */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* t2 */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  val outerProduct: js.Function2[
    /* v1 */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* v2 */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  @js.native
  object matMul extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T, transposeA: scala.Boolean): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: T, transposeA: scala.Boolean, transposeB: scala.Boolean): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: T, b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, transposeA: scala.Boolean): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      a: T,
      b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      transposeA: scala.Boolean,
      transposeB: scala.Boolean
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, b: T): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](a: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, b: T, transposeA: scala.Boolean): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      a: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      b: T,
      transposeA: scala.Boolean,
      transposeB: scala.Boolean
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      a: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      a: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      transposeA: scala.Boolean
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      a: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      b: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      transposeA: scala.Boolean,
      transposeB: scala.Boolean
    ): T = js.native
  }
  
}

