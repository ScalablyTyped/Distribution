package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemCaption extends StObject {
  
  var item: String
  
  var itemCaption: String
  
  var itemControl: String
  
  var itemDecorator: String
  
  var itemDisabled: String
  
  var itemHover: String
  
  var itemIcon: String
  
  var itemSelected: String
  
  var root: String
}
object ItemCaption {
  
  inline def apply(
    item: String,
    itemCaption: String,
    itemControl: String,
    itemDecorator: String,
    itemDisabled: String,
    itemHover: String,
    itemIcon: String,
    itemSelected: String,
    root: String
  ): ItemCaption = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemCaption = itemCaption.asInstanceOf[js.Any], itemControl = itemControl.asInstanceOf[js.Any], itemDecorator = itemDecorator.asInstanceOf[js.Any], itemDisabled = itemDisabled.asInstanceOf[js.Any], itemHover = itemHover.asInstanceOf[js.Any], itemIcon = itemIcon.asInstanceOf[js.Any], itemSelected = itemSelected.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemCaption]
  }
  
  extension [Self <: ItemCaption](x: Self) {
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemCaption(value: String): Self = StObject.set(x, "itemCaption", value.asInstanceOf[js.Any])
    
    inline def setItemControl(value: String): Self = StObject.set(x, "itemControl", value.asInstanceOf[js.Any])
    
    inline def setItemDecorator(value: String): Self = StObject.set(x, "itemDecorator", value.asInstanceOf[js.Any])
    
    inline def setItemDisabled(value: String): Self = StObject.set(x, "itemDisabled", value.asInstanceOf[js.Any])
    
    inline def setItemHover(value: String): Self = StObject.set(x, "itemHover", value.asInstanceOf[js.Any])
    
    inline def setItemIcon(value: String): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
    
    inline def setItemSelected(value: String): Self = StObject.set(x, "itemSelected", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
