package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackedRNNCellsArgs
  extends StObject
     with LayerArgs {
  
  /**
    * A `Array` of `RNNCell` instances.
    */
  var cells: js.Array[RNNCell]
}
object StackedRNNCellsArgs {
  
  inline def apply(cells: js.Array[RNNCell]): StackedRNNCellsArgs = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackedRNNCellsArgs]
  }
  
  extension [Self <: StackedRNNCellsArgs](x: Self) {
    
    inline def setCells(value: js.Array[RNNCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: RNNCell*): Self = StObject.set(x, "cells", js.Array(value :_*))
  }
}
