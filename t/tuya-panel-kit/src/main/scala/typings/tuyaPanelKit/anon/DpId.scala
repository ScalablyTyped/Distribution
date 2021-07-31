package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.mod.DpValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DpId extends StObject {
  
  var dpId: String
  
  var dpName: String
  
  var rangeKeys: js.Array[DpValue]
  
  var rangeValues: js.Array[String]
  
  var selected: Double
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
  implicit class DpIdMutableBuilder[Self <: DpId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDpId(value: String): Self = StObject.set(x, "dpId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpName(value: String): Self = StObject.set(x, "dpName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKeys(value: js.Array[DpValue]): Self = StObject.set(x, "rangeKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKeysVarargs(value: DpValue*): Self = StObject.set(x, "rangeKeys", js.Array(value :_*))
    
    @scala.inline
    def setRangeValues(value: js.Array[String]): Self = StObject.set(x, "rangeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeValuesVarargs(value: String*): Self = StObject.set(x, "rangeValues", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
