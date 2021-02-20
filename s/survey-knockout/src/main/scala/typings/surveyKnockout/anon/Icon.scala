package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Icon extends StObject {
  
  var icon: String = js.native
  
  var item: String = js.native
  
  var locationBottom: String = js.native
  
  var locationTop: String = js.native
  
  var root: String = js.native
}
object Icon {
  
  @scala.inline
  def apply(icon: String, item: String, locationBottom: String, locationTop: String, root: String): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], locationBottom = locationBottom.asInstanceOf[js.Any], locationTop = locationTop.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  @scala.inline
  implicit class IconMutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationBottom(value: String): Self = StObject.set(x, "locationBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationTop(value: String): Self = StObject.set(x, "locationTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
