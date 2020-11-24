package typings.tuyaPanelKit.mod

import typings.tuyaPanelKit.tuyaPanelKitStrings.ro
import typings.tuyaPanelKit.tuyaPanelKitStrings.rw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DpSchema extends js.Object {
  
  var code: String = js.native
  
  var dptype: String = js.native
  
  var iconname: String = js.native
  
  var id: String = js.native
  
  /**
    * type: 'bitmap' only
    */
  var label: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * type: 'value' only
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * type: 'bitmap' only
    */
  var maxlen: js.UndefOr[Double] = js.native
  
  /**
    * type: 'value' only
    */
  var min: js.UndefOr[Double] = js.native
  
  var mode: rw | ro = js.native
  
  var name: String = js.native
  
  /**
    * type: 'enum' only
    */
  var range: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * type: 'value' only
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    * type: 'value' only
    */
  var step: js.UndefOr[Double] = js.native
  
  var `type`: DpType = js.native
  
  /**
    * type: 'value' only
    */
  var unit: js.UndefOr[String] = js.native
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
  implicit class DpSchemaOps[Self <: DpSchema] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDptype(value: String): Self = this.set("dptype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconname(value: String): Self = this.set("iconname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: rw | ro): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DpType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelVarargs(value: String*): Self = this.set("label", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: js.Array[String]): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxlen(value: Double): Self = this.set("maxlen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxlen: Self = this.set("maxlen", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: js.Any*): Self = this.set("range", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: js.Array[_]): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
