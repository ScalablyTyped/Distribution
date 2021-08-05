package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Touch 对象 */
trait TouchDetail extends StObject {
  
  /** 距离页面可显示区域 (屏幕除去导航条) 左上角距离，横向为 X 轴 */
  var clientX: Double
  
  /** 距离页面可显示区域 (屏幕除去导航条) 左上角距离，纵向为 Y 轴 */
  var clientY: Double
  
  /** 触摸点的标识符 */
  var identifier: Double
  
  /** 距离文档左上角的距离，文档的左上角为原点，横向为 X 轴 */
  var pageX: Double
  
  /** 距离文档左上角的距离，文档的左上角为原点，纵向为 Y 轴 */
  var pageY: Double
}
object TouchDetail {
  
  inline def apply(clientX: Double, clientY: Double, identifier: Double, pageX: Double, pageY: Double): TouchDetail = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchDetail]
  }
  
  extension [Self <: TouchDetail](x: Self) {
    
    inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: Double): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
  }
}
