package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepeatVectorLayerArgs extends LayerArgs {
  
  /**
    * The integer number of times to repeat the input.
    */
  var n: Double = js.native
}
object RepeatVectorLayerArgs {
  
  @scala.inline
  def apply(n: Double): RepeatVectorLayerArgs = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepeatVectorLayerArgs]
  }
  
  @scala.inline
  implicit class RepeatVectorLayerArgsMutableBuilder[Self <: RepeatVectorLayerArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
  }
}
