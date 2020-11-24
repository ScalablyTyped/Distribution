package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
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
  implicit class StackedRNNCellsArgsOps[Self <: StackedRNNCellsArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCellsVarargs(value: RNNCell*): Self = this.set("cells", js.Array(value :_*))
    
    @scala.inline
    def setCells(value: js.Array[RNNCell]): Self = this.set("cells", value.asInstanceOf[js.Any])
  }
}
