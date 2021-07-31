package typings.wegameApi.wx.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// --触摸对象
trait Touch extends StObject {
  
  /**
    * 触点相对于游戏窗口的 X 轴距离。
    */
  var clientX: Double
  
  /**
    * 触点相对于游戏窗口的 Y 轴距离。
    */
  var clientY: Double
  
  /**
    * Touch 对象的唯一标识符，只读属性。一次触摸动作(我们值的是手指的触摸)在平面上移动的整个过程中, 该标识符不变。可以根据它来判断跟踪的是否是同一次触摸过程。
    */
  var identifier: Double
  
  /**
    * 触点相对于整体页面的 X 轴距离。
    */
  var pageX: Double
  
  /**
    * 触点相对于整体页面的 Y 轴距离。
    */
  var pageY: Double
}
object Touch {
  
  @scala.inline
  def apply(clientX: Double, clientY: Double, identifier: Double, pageX: Double, pageY: Double): Touch = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Touch]
  }
  
  @scala.inline
  implicit class TouchMutableBuilder[Self <: Touch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: Double): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
  }
}
