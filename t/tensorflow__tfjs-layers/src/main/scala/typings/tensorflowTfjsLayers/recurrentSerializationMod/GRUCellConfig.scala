package typings.tensorflowTfjsLayers.recurrentSerializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GRUCellConfig extends SimpleRNNCellConfig {
  
  var implementation: js.UndefOr[Double] = js.native
  
  var recurrent_activation: js.UndefOr[String] = js.native
}
object GRUCellConfig {
  
  @scala.inline
  def apply(units: Double): GRUCellConfig = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[GRUCellConfig]
  }
  
  @scala.inline
  implicit class GRUCellConfigOps[Self <: GRUCellConfig] (val x: Self) extends AnyVal {
    
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
    def setImplementation(value: Double): Self = this.set("implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplementation: Self = this.set("implementation", js.undefined)
    
    @scala.inline
    def setRecurrent_activation(value: String): Self = this.set("recurrent_activation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrent_activation: Self = this.set("recurrent_activation", js.undefined)
  }
}
