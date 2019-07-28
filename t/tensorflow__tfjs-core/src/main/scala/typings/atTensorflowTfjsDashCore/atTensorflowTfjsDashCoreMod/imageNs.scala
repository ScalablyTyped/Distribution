package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.bilinear
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.nearest
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "image")
@js.native
object imageNs extends js.Object {
  val cropAndResize: js.Function6[
    /* image */ Tensor4D | TensorLike, 
    /* boxes */ Tensor2D | TensorLike, 
    /* boxInd */ Tensor1D | TensorLike, 
    /* cropSize */ js.Tuple2[Double, Double], 
    /* method */ js.UndefOr[bilinear | nearest], 
    /* extrapolationValue */ js.UndefOr[Double], 
    Tensor4D
  ] = js.native
  val nonMaxSuppression: js.Function5[
    /* boxes */ Tensor2D | TensorLike, 
    /* scores */ Tensor1D | TensorLike, 
    /* maxOutputSize */ Double, 
    /* iouThreshold */ js.UndefOr[Double], 
    /* scoreThreshold */ js.UndefOr[Double], 
    Tensor1D
  ] = js.native
  val nonMaxSuppressionAsync: js.Function5[
    /* boxes */ Tensor2D | TensorLike, 
    /* scores */ Tensor1D | TensorLike, 
    /* maxOutputSize */ Double, 
    /* iouThreshold */ js.UndefOr[Double], 
    /* scoreThreshold */ js.UndefOr[Double], 
    js.Promise[Tensor1D]
  ] = js.native
  @js.native
  object resizeBilinear extends js.Object {
    def apply[T /* <: Tensor3D | Tensor4D */](images: T, size: js.Tuple2[Double, Double]): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](images: T, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double]): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  }
  
  @js.native
  object resizeNearestNeighbor extends js.Object {
    def apply[T /* <: Tensor3D | Tensor4D */](images: T, size: js.Tuple2[Double, Double]): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](images: T, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double]): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](images: TensorLike, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  }
  
}

