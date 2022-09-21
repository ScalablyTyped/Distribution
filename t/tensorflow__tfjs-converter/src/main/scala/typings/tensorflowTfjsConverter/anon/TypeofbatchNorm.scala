package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofbatchNorm extends StObject {
  
  def apply[R /* <: Rank */](
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R] | TensorLike,
    mean: typings.tensorflowTfjsCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    variance: typings.tensorflowTfjsCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    offset: js.UndefOr[typings.tensorflowTfjsCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike],
    scale: js.UndefOr[typings.tensorflowTfjsCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike],
    varianceEpsilon: js.UndefOr[Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
}
