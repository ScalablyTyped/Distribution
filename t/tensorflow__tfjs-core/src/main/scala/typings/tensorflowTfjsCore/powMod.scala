package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/pow", JSImport.Namespace)
@js.native
object powMod extends js.Object {
  
  @js.native
  object pow extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */](base: Tensor[Rank], exp: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](base: Tensor[Rank], exp: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](base: TensorLike, exp: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](base: TensorLike, exp: TensorLike): T = js.native
  }
}
