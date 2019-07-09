package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/concat_split", JSImport.Namespace)
@js.native
object distOpsConcatUnderscoreSplitMod extends js.Object {
  val concat1d: js.Function1[
    /* tensors */ js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D
  ] = js.native
  val concat2d: js.Function2[
    /* tensors */ js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* axis */ scala.Double, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  val concat3d: js.Function2[
    /* tensors */ js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* axis */ scala.Double, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D
  ] = js.native
  val concat4d: js.Function2[
    /* tensors */ js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* axis */ scala.Double, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D
  ] = js.native
  @js.native
  object concat extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](tensors: js.Array[T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike]): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](tensors: js.Array[T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike], axis: scala.Double): T = js.native
  }
  
  @js.native
  object split extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, numOrSizeSplits: js.Array[scala.Double]): js.Array[T] = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, numOrSizeSplits: js.Array[scala.Double], axis: scala.Double): js.Array[T] = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, numOrSizeSplits: scala.Double): js.Array[T] = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, numOrSizeSplits: scala.Double, axis: scala.Double): js.Array[T] = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, numOrSizeSplits: js.Array[scala.Double]): js.Array[T] = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      numOrSizeSplits: js.Array[scala.Double],
      axis: scala.Double
    ): js.Array[T] = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, numOrSizeSplits: scala.Double): js.Array[T] = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      numOrSizeSplits: scala.Double,
      axis: scala.Double
    ): js.Array[T] = js.native
  }
  
}

