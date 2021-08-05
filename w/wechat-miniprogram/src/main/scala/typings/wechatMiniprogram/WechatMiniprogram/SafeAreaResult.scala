package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 在竖屏正方向下的安全区域
  *
  * 最低基础库： `2.7.0` */
trait SafeAreaResult extends StObject {
  
  /** 安全区域右下角纵坐标 */
  var bottom: Double
  
  /** 安全区域的高度，单位逻辑像素 */
  var height: Double
  
  /** 安全区域左上角横坐标 */
  var left: Double
  
  /** 安全区域右下角横坐标 */
  var right: Double
  
  /** 安全区域左上角纵坐标 */
  var top: Double
  
  /** 安全区域的宽度，单位逻辑像素 */
  var width: Double
}
object SafeAreaResult {
  
  inline def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): SafeAreaResult = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeAreaResult]
  }
  
  extension [Self <: SafeAreaResult](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
