package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetTabBarStyleOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** tab 的背景色 */
  var backgroundColor: String = js.native
  
  /** tabbar上边框的颜色， 仅支持 black/white */
  var borderStyle: String = js.native
  
  /** tab 上的文字默认颜色 */
  var color: String = js.native
  
  /** tab 上的文字选中时的颜色 */
  var selectedColor: String = js.native
}
object SetTabBarStyleOptions {
  
  @scala.inline
  def apply(backgroundColor: String, borderStyle: String, color: String, selectedColor: String): SetTabBarStyleOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], selectedColor = selectedColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTabBarStyleOptions]
  }
  
  @scala.inline
  implicit class SetTabBarStyleOptionsMutableBuilder[Self <: SetTabBarStyleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
  }
}
