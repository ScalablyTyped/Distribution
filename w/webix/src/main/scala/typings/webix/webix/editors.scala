package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait editors extends StObject {
  
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
  implicit class editorsMutableBuilder[Self <: editors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$popup(value: js.Any): Self = StObject.set(x, "$popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckbox(value: String): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCombo(value: String): Self = StObject.set(x, "combo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInline-checkbox`(value: String): Self = StObject.set(x, "inline-checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInline-text`(value: String): Self = StObject.set(x, "inline-text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiselect(value: String): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRichselect(value: String): Self = StObject.set(x, "richselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
