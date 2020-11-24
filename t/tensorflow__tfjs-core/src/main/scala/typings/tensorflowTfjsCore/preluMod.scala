package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/prelu", JSImport.Namespace)
@js.native
object preluMod extends js.Object {
  
  @js.native
  object prelu extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */](x: T, alpha: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, alpha: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, alpha: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, alpha: TensorLike): T = js.native
  }
}
