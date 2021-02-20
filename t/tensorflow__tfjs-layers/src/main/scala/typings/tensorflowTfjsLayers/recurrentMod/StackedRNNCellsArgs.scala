package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackedRNNCellsArgs extends LayerArgs {
  
  /**
    * A `Array` of `RNNCell` instances.
    */
  var cells: js.Array[RNNCell] = js.native
}
object StackedRNNCellsArgs {
  
  @scala.inline
  def apply(cells: js.Array[RNNCell]): StackedRNNCellsArgs = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackedRNNCellsArgs]
  }
  
  @scala.inline
  implicit class StackedRNNCellsArgsMutableBuilder[Self <: StackedRNNCellsArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCells(value: js.Array[RNNCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellsVarargs(value: RNNCell*): Self = StObject.set(x, "cells", js.Array(value :_*))
  }
}
