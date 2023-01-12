package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTabBarStyleOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** tab 的背景色 */
  var backgroundColor: String
  
  /** tabbar上边框的颜色， 仅支持 black/white */
  var borderStyle: String
  
  /** tab 上的文字默认颜色 */
  var color: String
  
  /** tab 上的文字选中时的颜色 */
  var selectedColor: String
}
object SetTabBarStyleOptions {
  
  inline def apply(backgroundColor: String, borderStyle: String, color: String, selectedColor: String): SetTabBarStyleOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], selectedColor = selectedColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTabBarStyleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetTabBarStyleOptions] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
  }
}
