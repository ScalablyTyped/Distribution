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

@JSImport("@tensorflow/tfjs-core/dist/ops/batchnorm", JSImport.Namespace)
@js.native
object distOpsBatchnormMod extends js.Object {
  val batchNorm2d: js.Function6[
    /* x */ Tensor2D | TensorLike, 
    /* mean */ Tensor2D | Tensor1D | TensorLike, 
    /* variance */ Tensor2D | Tensor1D | TensorLike, 
    /* offset */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
    /* scale */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
    /* varianceEpsilon */ js.UndefOr[Double], 
    Tensor2D
  ] = js.native
  val batchNorm3d: js.Function6[
    /* x */ Tensor3D | TensorLike, 
    /* mean */ Tensor3D | Tensor1D | TensorLike, 
    /* variance */ Tensor3D | Tensor1D | TensorLike, 
    /* offset */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
    /* scale */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
    /* varianceEpsilon */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  val batchNorm4d: js.Function6[
    /* x */ Tensor4D | TensorLike, 
    /* mean */ Tensor4D | Tensor1D | TensorLike, 
    /* variance */ Tensor4D | Tensor1D | TensorLike, 
    /* offset */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
    /* scale */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
    /* varianceEpsilon */ js.UndefOr[Double], 
    Tensor4D
  ] = js.native
  val batchNormalization2d: js.Function6[
    /* x */ Tensor2D | TensorLike, 
    /* mean */ Tensor2D | Tensor1D | TensorLike, 
    /* variance */ Tensor2D | Tensor1D | TensorLike, 
    /* varianceEpsilon */ js.UndefOr[Double], 
    /* scale */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
    /* offset */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
    Tensor2D
  ] = js.native
  val batchNormalization3d: js.Function6[
    /* x */ Tensor3D | TensorLike, 
    /* mean */ Tensor3D | Tensor1D | TensorLike, 
    /* variance */ Tensor3D | Tensor1D | TensorLike, 
    /* varianceEpsilon */ js.UndefOr[Double], 
    /* scale */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
    /* offset */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
    Tensor3D
  ] = js.native
  val batchNormalization4d: js.Function6[
    /* x */ Tensor4D | TensorLike, 
    /* mean */ Tensor4D | Tensor1D | TensorLike, 
    /* variance */ Tensor4D | Tensor1D | TensorLike, 
    /* varianceEpsilon */ js.UndefOr[Double], 
    /* scale */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
    /* offset */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
    Tensor4D
  ] = js.native
  @js.native
  object batchNorm extends js.Object {
    def apply[R /* <: Rank */](
      x: Tensor[R] | TensorLike,
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      x: Tensor[R] | TensorLike,
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike,
      offset: Tensor[R] | Tensor1D | TensorLike
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      x: Tensor[R] | TensorLike,
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike,
      offset: Tensor[R] | Tensor1D | TensorLike,
      scale: Tensor[R] | Tensor1D | TensorLike
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      x: Tensor[R] | TensorLike,
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike,
      offset: Tensor[R] | Tensor1D | TensorLike,
      scale: Tensor[R] | Tensor1D | TensorLike,
      varianceEpsilon: Double
    ): Tensor[R] = js.native
  }
  
  @js.native
  object batchNormalization extends js.Object {
    def apply[R /* <: Rank */](
      x: Tensor[R] | TensorLike,
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      x: Tensor[R] | TensorLike,
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike,
      varianceEpsilon: Double
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      x: Tensor[R] | TensorLike,
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike,
      varianceEpsilon: Double,
      scale: Tensor[R] | Tensor1D | TensorLike
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      x: Tensor[R] | TensorLike,
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike,
      varianceEpsilon: Double,
      scale: Tensor[R] | Tensor1D | TensorLike,
      offset: Tensor[R] | Tensor1D | TensorLike
    ): Tensor[R] = js.native
  }
  
}

