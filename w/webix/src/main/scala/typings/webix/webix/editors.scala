package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait editors extends js.Object {
  
  @JSName("$popup")
  var $popup: js.Any = js.native
  
  var checkbox: String = js.native
  
  var color: String = js.native
  
  var combo: String = js.native
  
  var date: String = js.native
  
  var `inline-checkbox`: String = js.native
  
  var `inline-text`: String = js.native
  
  var multiselect: String = js.native
  
  var password: String = js.native
  
  var popup: String = js.native
  
  var richselect: String = js.native
  
  var select: String = js.native
  
  var text: String = js.native
}
object editors {
  
  @scala.inline
  def apply(
    $popup: js.Any,
    checkbox: String,
    color: String,
    combo: String,
    date: String,
    `inline-checkbox`: String,
    `inline-text`: String,
    multiselect: String,
    password: String,
    popup: String,
    richselect: String,
    select: String,
    text: String
  ): editors = {
    val __obj = js.Dynamic.literal($popup = $popup.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], combo = combo.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], multiselect = multiselect.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], richselect = richselect.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("inline-checkbox")(`inline-checkbox`.asInstanceOf[js.Any])
    __obj.updateDynamic("inline-text")(`inline-text`.asInstanceOf[js.Any])
    __obj.asInstanceOf[editors]
  }
  
  @scala.inline
  implicit class editorsOps[Self <: editors] (val x: Self) extends AnyVal {
    
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
    def set$popup(value: js.Any): Self = this.set("$popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckbox(value: String): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCombo(value: String): Self = this.set("combo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInline-checkbox`(value: String): Self = this.set("inline-checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInline-text`(value: String): Self = this.set("inline-text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiselect(value: String): Self = this.set("multiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopup(value: String): Self = this.set("popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRichselect(value: String): Self = this.set("richselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: String): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
