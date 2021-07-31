package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemInline extends StObject {
  
  var clearButton: String
  
  var image: String
  
  var item: String
  
  var itemChecked: String
  
  var itemControl: String
  
  var itemDisabled: String
  
  var itemHover: String
  
  var itemInline: String
  
  var itemText: String
  
  var label: String
  
  var other: String
  
  var root: String
}
object ItemInline {
  
  @scala.inline
  def apply(
    clearButton: String,
    image: String,
    item: String,
    itemChecked: String,
    itemControl: String,
    itemDisabled: String,
    itemHover: String,
    itemInline: String,
    itemText: String,
    label: String,
    other: String,
    root: String
  ): ItemInline = {
    val __obj = js.Dynamic.literal(clearButton = clearButton.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemControl = itemControl.asInstanceOf[js.Any], itemDisabled = itemDisabled.asInstanceOf[js.Any], itemHover = itemHover.asInstanceOf[js.Any], itemInline = itemInline.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemInline]
  }
  
  @scala.inline
  implicit class ItemInlineMutableBuilder[Self <: ItemInline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearButton(value: String): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemChecked(value: String): Self = StObject.set(x, "itemChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemControl(value: String): Self = StObject.set(x, "itemControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDisabled(value: String): Self = StObject.set(x, "itemDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemHover(value: String): Self = StObject.set(x, "itemHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemInline(value: String): Self = StObject.set(x, "itemInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemText(value: String): Self = StObject.set(x, "itemText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
