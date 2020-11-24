package typings.tensorflowTfjsNode.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateSaved extends js.Object {
  
  var dateSaved: Date = js.native
  
  var modelTopologyBytes: Double = js.native
  
  var modelTopologyType: String = js.native
  
  var weightDataBytes: Double = js.native
  
  var weightSpecsBytes: Double = js.native
}
object DateSaved {
  
  @scala.inline
  def apply(
    dateSaved: Date,
    modelTopologyBytes: Double,
    modelTopologyType: String,
    weightDataBytes: Double,
    weightSpecsBytes: Double
  ): DateSaved = {
    val __obj = js.Dynamic.literal(dateSaved = dateSaved.asInstanceOf[js.Any], modelTopologyBytes = modelTopologyBytes.asInstanceOf[js.Any], modelTopologyType = modelTopologyType.asInstanceOf[js.Any], weightDataBytes = weightDataBytes.asInstanceOf[js.Any], weightSpecsBytes = weightSpecsBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateSaved]
  }
  
  @scala.inline
  implicit class DateSavedOps[Self <: DateSaved] (val x: Self) extends AnyVal {
    
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
    def setDateSaved(value: Date): Self = this.set("dateSaved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelTopologyBytes(value: Double): Self = this.set("modelTopologyBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelTopologyType(value: String): Self = this.set("modelTopologyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightDataBytes(value: Double): Self = this.set("weightDataBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightSpecsBytes(value: Double): Self = this.set("weightSpecsBytes", value.asInstanceOf[js.Any])
  }
}
