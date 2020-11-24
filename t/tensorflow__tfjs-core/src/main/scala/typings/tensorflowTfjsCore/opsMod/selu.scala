package typings.tensorflowTfjsCore.opsMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "selu")
@js.native
object selu extends js.Object {
  
  def apply[T /* <: Tensor[Rank] */](x: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
}
