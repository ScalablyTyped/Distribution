package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchnormMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/batchnorm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def batchNorm[R /* <: Rank */](
    x: Tensor[R] | TensorLike,
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    offset: js.UndefOr[Tensor[R] | Tensor1D | TensorLike],
    scale: js.UndefOr[Tensor[R] | Tensor1D | TensorLike],
    varianceEpsilon: js.UndefOr[Double]
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("batchNorm")(x.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], variance.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], varianceEpsilon.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
}
