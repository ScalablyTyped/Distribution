package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/boolean_mask", JSImport.Namespace)
@js.native
object booleanMaskMod extends js.Object {
  
  val booleanMaskAsync: js.Function3[
    /* tensor */ Tensor[Rank] | TensorLike, 
    /* mask */ Tensor[Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double], 
    js.Promise[Tensor[Rank]]
  ] = js.native
}
