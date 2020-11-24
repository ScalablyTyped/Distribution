package typings.tensorflowTfjsCore.opsMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "print")
@js.native
object print extends js.Object {
  
  def apply[T /* <: Tensor[Rank] */](x: T): Unit = js.native
  def apply[T /* <: Tensor[Rank] */](x: T, verbose: Boolean): Unit = js.native
}
