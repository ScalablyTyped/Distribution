package typings.tensorflowTfjsLayers.distLayersRecurrentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RNNLayerArgs
  extends StObject
     with BaseRNNLayerArgs {
  
  @JSName("cell")
  var cell_RNNLayerArgs: RNNCell | js.Array[RNNCell]
}
object RNNLayerArgs {
  
  inline def apply(cell: RNNCell | js.Array[RNNCell]): RNNLayerArgs = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNNLayerArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RNNLayerArgs] (val x: Self) extends AnyVal {
    
    inline def setCell(value: RNNCell | js.Array[RNNCell]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setCellVarargs(value: RNNCell*): Self = StObject.set(x, "cell", js.Array(value*))
  }
}
