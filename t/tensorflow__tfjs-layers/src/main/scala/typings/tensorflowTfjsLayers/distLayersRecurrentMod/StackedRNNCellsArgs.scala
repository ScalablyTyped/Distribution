package typings.tensorflowTfjsLayers.distLayersRecurrentMod

import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackedRNNCellsArgs
  extends StObject
     with LayerArgs {
  
  /**
    * An `Array` of `RNNCell` instances.
    */
  var cells: js.Array[RNNCell]
}
object StackedRNNCellsArgs {
  
  inline def apply(cells: js.Array[RNNCell]): StackedRNNCellsArgs = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackedRNNCellsArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StackedRNNCellsArgs] (val x: Self) extends AnyVal {
    
    inline def setCells(value: js.Array[RNNCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: RNNCell*): Self = StObject.set(x, "cells", js.Array(value*))
  }
}
