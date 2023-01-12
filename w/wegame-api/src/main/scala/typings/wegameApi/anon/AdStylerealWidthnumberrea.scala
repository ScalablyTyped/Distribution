package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wegame-api.wx.types.AdStyle & {  realWidth :number,   realHeight :number} */
trait AdStylerealWidthnumberrea extends StObject {
  
  /**
    * 广告组件的高度
    */
  var height: Double
  
  /**
    * 广告组件的左上角横坐标
    */
  var left: Double
  
  /**
    * grid(格子) 广告组件经过缩放后真实的高度
    */
  var realHeight: Double
  
  /**
    * grid(格子) 广告组件经过缩放后真实的宽度
    */
  var realWidth: Double
  
  /**
    * 广告组件的左上角纵坐标
    */
  var top: Double
  
  /**
    * 广告组件的宽度。最小 300，最大至 屏幕宽度（屏幕宽度可以通过 wx.getSystemInfoSync() 获取）。
    */
  var width: Double
}
object AdStylerealWidthnumberrea {
  
  inline def apply(height: Double, left: Double, realHeight: Double, realWidth: Double, top: Double, width: Double): AdStylerealWidthnumberrea = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], realHeight = realHeight.asInstanceOf[js.Any], realWidth = realWidth.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdStylerealWidthnumberrea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdStylerealWidthnumberrea] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRealHeight(value: Double): Self = StObject.set(x, "realHeight", value.asInstanceOf[js.Any])
    
    inline def setRealWidth(value: Double): Self = StObject.set(x, "realWidth", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
