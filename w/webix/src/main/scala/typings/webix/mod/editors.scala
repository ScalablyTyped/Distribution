package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait editors extends StObject {
  
  @JSName("$popup")
  var $popup: Any
  
  var checkbox: String
  
  var color: String
  
  var combo: String
  
  var date: String
  
  var `inline-checkbox`: String
  
  var `inline-text`: String
  
  var multiselect: String
  
  var password: String
  
  var popup: String
  
  var richselect: String
  
  var select: String
  
  var text: String
}
object editors {
  
  @JSImport("webix", "editors")
  @js.native
  val ^ : typings.webix.webix.editors = js.native
  
  extension [Self <: editors](x: Self) {
    
    inline def set$popup(value: Any): Self = StObject.set(x, "$popup", value.asInstanceOf[js.Any])
    
    inline def setCheckbox(value: String): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setCombo(value: String): Self = StObject.set(x, "combo", value.asInstanceOf[js.Any])
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def `setInline-checkbox`(value: String): Self = StObject.set(x, "inline-checkbox", value.asInstanceOf[js.Any])
    
    inline def `setInline-text`(value: String): Self = StObject.set(x, "inline-text", value.asInstanceOf[js.Any])
    
    inline def setMultiselect(value: String): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setRichselect(value: String): Self = StObject.set(x, "richselect", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
