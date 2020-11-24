package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.Values
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/unique", JSImport.Namespace)
@js.native
object uniqueMod extends js.Object {
  
  @js.native
  object unique extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */](x: T): Values[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, axis: Double): Values[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): Values[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): Values[T] = js.native
  }
}
