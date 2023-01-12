package typings.tensorflowTfjsLayers.distLayersCoreMod

import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermuteLayerArgs
  extends StObject
     with LayerArgs {
  
  /**
    * Array of integers. Permutation pattern. Does not include the
    * sample (batch) dimension. Index starts at 1.
    * For instance, `[2, 1]` permutes the first and second dimensions
    * of the input.
    */
  var dims: js.Array[Double]
}
object PermuteLayerArgs {
  
  inline def apply(dims: js.Array[Double]): PermuteLayerArgs = {
    val __obj = js.Dynamic.literal(dims = dims.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermuteLayerArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PermuteLayerArgs] (val x: Self) extends AnyVal {
    
    inline def setDims(value: js.Array[Double]): Self = StObject.set(x, "dims", value.asInstanceOf[js.Any])
    
    inline def setDimsVarargs(value: Double*): Self = StObject.set(x, "dims", js.Array(value*))
  }
}
