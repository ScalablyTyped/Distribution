package typings.tensorflowTfjsLayers.baseCallbacksMod

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "History")
@js.native
class History () extends BaseCallback {
  
  var epoch: js.Array[Double] = js.native
  
  var history: StringDictionary[js.Array[Double | Tensor[Rank]]] = js.native
  
  /**
    * Await the values of all losses and metrics.
    */
  def syncData(): js.Promise[Unit] = js.native
}
