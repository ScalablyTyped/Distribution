package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/slice", JSImport.Namespace)
@js.native
object distOpsSliceMod extends js.Object {
  val slice1d: js.Function3[/* x */ Tensor1D | TensorLike, /* begin */ Double, /* size */ Double, Tensor1D] = js.native
  val slice2d: js.Function3[
    /* x */ Tensor2D | TensorLike, 
    /* begin */ js.Tuple2[Double, Double], 
    /* size */ js.Tuple2[Double, Double], 
    Tensor2D
  ] = js.native
  val slice3d: js.Function3[
    /* x */ Tensor3D | TensorLike, 
    /* begin */ js.Tuple3[Double, Double, Double], 
    /* size */ js.Tuple3[Double, Double, Double], 
    Tensor3D
  ] = js.native
  val slice4d: js.Function3[
    /* x */ Tensor4D | TensorLike, 
    /* begin */ js.Tuple4[Double, Double, Double, Double], 
    /* size */ js.Tuple4[Double, Double, Double, Double], 
    Tensor4D
  ] = js.native
  @js.native
  object slice extends js.Object {
    def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: js.Array[Double]): T = js.native
    def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: js.Array[Double], size: js.Array[Double]): T = js.native
    def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: js.Array[Double], size: Double): T = js.native
    def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: Double): T = js.native
    def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: Double, size: js.Array[Double]): T = js.native
    def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: Double, size: Double): T = js.native
    def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: js.Array[Double]): T = js.native
    def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: js.Array[Double], size: js.Array[Double]): T = js.native
    def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: js.Array[Double], size: Double): T = js.native
    def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: Double): T = js.native
    def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: Double, size: js.Array[Double]): T = js.native
    def apply[R /* <: Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: Double, size: Double): T = js.native
  }
  
}

