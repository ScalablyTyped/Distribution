package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/batchnorm", JSImport.Namespace)
@js.native
object distOpsBatchnormMod extends js.Object {
  val batchNorm2d: js.Function6[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* mean */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* variance */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* offset */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* scale */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* varianceEpsilon */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  val batchNorm3d: js.Function6[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* mean */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* variance */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* offset */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* scale */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* varianceEpsilon */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D
  ] = js.native
  val batchNorm4d: js.Function6[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* mean */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* variance */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* offset */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* scale */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* varianceEpsilon */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D
  ] = js.native
  val batchNormalization2d: js.Function6[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* mean */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* variance */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* varianceEpsilon */ js.UndefOr[scala.Double], 
    /* scale */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* offset */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  val batchNormalization3d: js.Function6[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* mean */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* variance */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* varianceEpsilon */ js.UndefOr[scala.Double], 
    /* scale */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* offset */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D
  ] = js.native
  val batchNormalization4d: js.Function6[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* mean */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* variance */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* varianceEpsilon */ js.UndefOr[scala.Double], 
    /* scale */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* offset */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D
  ] = js.native
  @js.native
  object batchNorm extends js.Object {
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      mean: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      variance: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      mean: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      variance: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      offset: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      mean: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      variance: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      offset: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      scale: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      mean: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      variance: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      offset: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      scale: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      varianceEpsilon: scala.Double
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  }
  
  @js.native
  object batchNormalization extends js.Object {
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      mean: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      variance: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      mean: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      variance: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      varianceEpsilon: scala.Double
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      mean: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      variance: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      varianceEpsilon: scala.Double,
      scale: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
    def apply[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
      x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      mean: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      variance: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      varianceEpsilon: scala.Double,
      scale: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      offset: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  }
  
}

