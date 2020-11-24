package typings.tensorflowTfjsCore.backendUtilMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/backends/backend_util", "validateInput")
@js.native
object validateInput extends js.Object {
  
  def apply(updates: Tensor[Rank], indices: Tensor[Rank], shape: js.Array[Double]): Unit = js.native
}
