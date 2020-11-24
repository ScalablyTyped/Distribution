package typings.tensorflowTfjs.indexWithPolyfillsMod.backendUtil

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "backend_util.getFusedBiasGradient")
@js.native
object getFusedBiasGradient extends js.Object {
  
  def apply(bias: Tensor[Rank], dyActivation: Tensor[Rank]): Tensor[Rank] = js.native
}
