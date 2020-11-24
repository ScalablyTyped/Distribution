package typings.tensorflowTfjsLayers.recurrentSerializationMod

import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackedRNNCellsConfig extends LayerConfig {
  
  var cells: js.Array[RNNCellSerialization] = js.native
}
object StackedRNNCellsConfig {
  
  @scala.inline
  def apply(cells: js.Array[RNNCellSerialization]): StackedRNNCellsConfig = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackedRNNCellsConfig]
  }
  
  @scala.inline
  implicit class StackedRNNCellsConfigOps[Self <: StackedRNNCellsConfig] (val x: Self) extends AnyVal {
    
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
    def setCellsVarargs(value: RNNCellSerialization*): Self = this.set("cells", js.Array(value :_*))
    
    @scala.inline
    def setCells(value: js.Array[RNNCellSerialization]): Self = this.set("cells", value.asInstanceOf[js.Any])
  }
}
