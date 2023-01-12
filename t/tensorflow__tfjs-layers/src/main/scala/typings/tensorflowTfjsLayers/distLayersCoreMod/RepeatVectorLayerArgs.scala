package typings.tensorflowTfjsLayers.distLayersCoreMod

import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepeatVectorLayerArgs
  extends StObject
     with LayerArgs {
  
  /**
    * The integer number of times to repeat the input.
    */
  var n: Double
}
object RepeatVectorLayerArgs {
  
  inline def apply(n: Double): RepeatVectorLayerArgs = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepeatVectorLayerArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepeatVectorLayerArgs] (val x: Self) extends AnyVal {
    
    inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
  }
}
