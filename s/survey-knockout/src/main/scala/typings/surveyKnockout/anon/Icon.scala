package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  var icon: String
  
  var item: String
  
  var locationBottom: String
  
  var locationTop: String
  
  var root: String
}
object Icon {
  
  inline def apply(icon: String, item: String, locationBottom: String, locationTop: String, root: String): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], locationBottom = locationBottom.asInstanceOf[js.Any], locationTop = locationTop.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  extension [Self <: Icon](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setLocationBottom(value: String): Self = StObject.set(x, "locationBottom", value.asInstanceOf[js.Any])
    
    inline def setLocationTop(value: String): Self = StObject.set(x, "locationTop", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
