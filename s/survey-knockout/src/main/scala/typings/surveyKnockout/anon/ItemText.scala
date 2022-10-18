package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemText extends StObject {
  
  var clearButton: String
  
  var column: String
  
  var image: String
  
  var item: String
  
  var itemChecked: String
  
  var itemControl: String
  
  var itemInline: String
  
  var itemText: String
  
  var label: String
  
  var root: String
}
object ItemText {
  
  inline def apply(
    clearButton: String,
    column: String,
    image: String,
    item: String,
    itemChecked: String,
    itemControl: String,
    itemInline: String,
    itemText: String,
    label: String,
    root: String
  ): ItemText = {
    val __obj = js.Dynamic.literal(clearButton = clearButton.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemControl = itemControl.asInstanceOf[js.Any], itemInline = itemInline.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemText]
  }
  
  extension [Self <: ItemText](x: Self) {
    
    inline def setClearButton(value: String): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
    
    inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemChecked(value: String): Self = StObject.set(x, "itemChecked", value.asInstanceOf[js.Any])
    
    inline def setItemControl(value: String): Self = StObject.set(x, "itemControl", value.asInstanceOf[js.Any])
    
    inline def setItemInline(value: String): Self = StObject.set(x, "itemInline", value.asInstanceOf[js.Any])
    
    inline def setItemText(value: String): Self = StObject.set(x, "itemText", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
