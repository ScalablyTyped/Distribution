package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addNMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/add_n", "addN")
  @js.native
  def addN[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): T = js.native
}
