package typings.tuyaPanelKit.mod

import typings.tuyaPanelKit.tuyaPanelKitStrings.ro
import typings.tuyaPanelKit.tuyaPanelKitStrings.rw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DpSchema extends StObject {
  
  var code: String
  
  var dptype: String
  
  var iconname: String
  
  var id: String
  
  /**
    * type: 'bitmap' only
    */
  var label: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * type: 'value' only
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * type: 'bitmap' only
    */
  var maxlen: js.UndefOr[Double] = js.undefined
  
  /**
    * type: 'value' only
    */
  var min: js.UndefOr[Double] = js.undefined
  
  var mode: rw | ro
  
  var name: String
  
  /**
    * type: 'enum' only
    */
  var range: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * type: 'value' only
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * type: 'value' only
    */
  var step: js.UndefOr[Double] = js.undefined
  
  var `type`: DpType
  
  /**
    * type: 'value' only
    */
  var unit: js.UndefOr[String] = js.undefined
}
object DpSchema {
  
  @scala.inline
  def apply(
    code: String,
    dptype: String,
    iconname: String,
    id: String,
    mode: rw | ro,
    name: String,
    `type`: DpType
  ): DpSchema = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], dptype = dptype.asInstanceOf[js.Any], iconname = iconname.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DpSchema]
  }
  
  @scala.inline
  implicit class DpSchemaMutableBuilder[Self <: DpSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDptype(value: String): Self = StObject.set(x, "dptype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconname(value: String): Self = StObject.set(x, "iconname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: js.Array[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLabelVarargs(value: String*): Self = StObject.set(x, "label", js.Array(value :_*))
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMaxlen(value: Double): Self = StObject.set(x, "maxlen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxlenUndefined: Self = StObject.set(x, "maxlen", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMode(value: rw | ro): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: js.Array[js.Any]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: js.Any*): Self = StObject.set(x, "range", js.Array(value :_*))
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setType(value: DpType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
