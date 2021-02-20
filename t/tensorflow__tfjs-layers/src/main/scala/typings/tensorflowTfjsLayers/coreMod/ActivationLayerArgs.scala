package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivationLayerArgs extends LayerArgs {
  
  /**
    * Name of the activation function to use.
    */
  var activation: ActivationIdentifier = js.native
}
object ActivationLayerArgs {
  
  @scala.inline
  def apply(activation: ActivationIdentifier): ActivationLayerArgs = {
    val __obj = js.Dynamic.literal(activation = activation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivationLayerArgs]
  }
  
  @scala.inline
  implicit class ActivationLayerArgsMutableBuilder[Self <: ActivationLayerArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivation(value: ActivationIdentifier): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
  }
}
