package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultSizeMode extends StObject {
  
  var defaultSizeMode: String
  
  var item: String
  
  var itemAsIcon: String
  
  var itemIcon: String
  
  var itemPressed: String
  
  var itemTitle: String
  
  var root: String
  
  var smallSizeMode: String
}
object DefaultSizeMode {
  
  inline def apply(
    defaultSizeMode: String,
    item: String,
    itemAsIcon: String,
    itemIcon: String,
    itemPressed: String,
    itemTitle: String,
    root: String,
    smallSizeMode: String
  ): DefaultSizeMode = {
    val __obj = js.Dynamic.literal(defaultSizeMode = defaultSizeMode.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemAsIcon = itemAsIcon.asInstanceOf[js.Any], itemIcon = itemIcon.asInstanceOf[js.Any], itemPressed = itemPressed.asInstanceOf[js.Any], itemTitle = itemTitle.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], smallSizeMode = smallSizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSizeMode]
  }
  
  extension [Self <: DefaultSizeMode](x: Self) {
    
    inline def setDefaultSizeMode(value: String): Self = StObject.set(x, "defaultSizeMode", value.asInstanceOf[js.Any])
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemAsIcon(value: String): Self = StObject.set(x, "itemAsIcon", value.asInstanceOf[js.Any])
    
    inline def setItemIcon(value: String): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
    
    inline def setItemPressed(value: String): Self = StObject.set(x, "itemPressed", value.asInstanceOf[js.Any])
    
    inline def setItemTitle(value: String): Self = StObject.set(x, "itemTitle", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSmallSizeMode(value: String): Self = StObject.set(x, "smallSizeMode", value.asInstanceOf[js.Any])
  }
}
