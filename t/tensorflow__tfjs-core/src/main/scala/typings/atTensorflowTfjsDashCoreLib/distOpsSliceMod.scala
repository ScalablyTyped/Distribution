package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/slice", JSImport.Namespace)
@js.native
object distOpsSliceMod extends js.Object {
  val slice1d: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* begin */ scala.Double, 
    /* size */ scala.Double, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D
  ] = js.native
  val slice2d: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* begin */ js.Tuple2[scala.Double, scala.Double], 
    /* size */ js.Tuple2[scala.Double, scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  val slice3d: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* begin */ js.Tuple3[scala.Double, scala.Double, scala.Double], 
    /* size */ js.Tuple3[scala.Double, scala.Double, scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D
  ] = js.native
  val slice4d: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* begin */ js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double], 
    /* size */ js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D
  ] = js.native
  @js.native
  object slice extends js.Object {
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */](x: T, begin: js.Array[scala.Double]): T = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */](x: T, begin: js.Array[scala.Double], size: js.Array[scala.Double]): T = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */](x: T, begin: js.Array[scala.Double], size: scala.Double): T = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */](x: T, begin: scala.Double): T = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */](x: T, begin: scala.Double, size: js.Array[scala.Double]): T = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */](x: T, begin: scala.Double, size: scala.Double): T = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, begin: js.Array[scala.Double]): T = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      begin: js.Array[scala.Double],
      size: js.Array[scala.Double]
    ): T = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      begin: js.Array[scala.Double],
      size: scala.Double
    ): T = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, begin: scala.Double): T = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      begin: scala.Double,
      size: js.Array[scala.Double]
    ): T = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, begin: scala.Double, size: scala.Double): T = js.native
  }
  
}

