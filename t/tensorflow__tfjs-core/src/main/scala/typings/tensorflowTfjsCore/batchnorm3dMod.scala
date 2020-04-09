package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/batchnorm3d", JSImport.Namespace)
@js.native
object batchnorm3dMod extends js.Object {
  val batchNorm3d: js.Function6[
    /* x */ Tensor3D | TensorLike, 
    /* mean */ Tensor3D | Tensor1D | TensorLike, 
    /* variance */ Tensor3D | Tensor1D | TensorLike, 
    /* offset */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
    /* scale */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
    /* varianceEpsilon */ js.UndefOr[Double], 
    Tensor3D
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
}

