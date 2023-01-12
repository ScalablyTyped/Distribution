package typings.wegameApi.wx.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomAdStyle extends StObject {
  
  /**
    * (只对小程序适用) 原生模板广告组件是否固定屏幕位置（不跟随屏幕滚动）
    */
  var fixed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 原生模板广告组件的左上角横坐标
    */
  var left: Double
  
  /**
    * 原生模板广告组件的左上角纵坐标
    */
  var top: Double
}
object CustomAdStyle {
  
  inline def apply(left: Double, top: Double): CustomAdStyle = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAdStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomAdStyle] (val x: Self) extends AnyVal {
    
    inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
