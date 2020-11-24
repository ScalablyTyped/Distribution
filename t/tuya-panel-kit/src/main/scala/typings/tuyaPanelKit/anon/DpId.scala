package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.mod.DpValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DpId extends js.Object {
  
  var dpId: String = js.native
  
  var dpName: String = js.native
  
  var rangeKeys: js.Array[DpValue] = js.native
  
  var rangeValues: js.Array[String] = js.native
  
  var selected: Double = js.native
}
object DpId {
  
  @scala.inline
  def apply(
    dpId: String,
    dpName: String,
    rangeKeys: js.Array[DpValue],
    rangeValues: js.Array[String],
    selected: Double
  ): DpId = {
    val __obj = js.Dynamic.literal(dpId = dpId.asInstanceOf[js.Any], dpName = dpName.asInstanceOf[js.Any], rangeKeys = rangeKeys.asInstanceOf[js.Any], rangeValues = rangeValues.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[DpId]
  }
  
  @scala.inline
  implicit class DpIdOps[Self <: DpId] (val x: Self) extends AnyVal {
    
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
    def setDpId(value: String): Self = this.set("dpId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpName(value: String): Self = this.set("dpName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKeysVarargs(value: DpValue*): Self = this.set("rangeKeys", js.Array(value :_*))
    
    @scala.inline
    def setRangeKeys(value: js.Array[DpValue]): Self = this.set("rangeKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeValuesVarargs(value: String*): Self = this.set("rangeValues", js.Array(value :_*))
    
    @scala.inline
    def setRangeValues(value: js.Array[String]): Self = this.set("rangeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Double): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
}
