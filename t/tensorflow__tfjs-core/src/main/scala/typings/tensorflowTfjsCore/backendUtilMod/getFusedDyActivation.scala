package typings.tensorflowTfjsCore.backendUtilMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.fusedTypesMod.Activation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/backends/backend_util", "getFusedDyActivation")
@js.native
object getFusedDyActivation extends js.Object {
  
  def apply(dy: Tensor[Rank], y: Tensor[Rank], activation: Activation): Tensor[Rank] = js.native
}
