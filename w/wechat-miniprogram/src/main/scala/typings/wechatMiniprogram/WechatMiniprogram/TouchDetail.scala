package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Touch 对象 */
@js.native
trait TouchDetail extends StObject {
  
  /** 距离页面可显示区域 (屏幕除去导航条) 左上角距离，横向为 X 轴 */
  var clientX: Double = js.native
  
  /** 距离页面可显示区域 (屏幕除去导航条) 左上角距离，纵向为 Y 轴 */
  var clientY: Double = js.native
  
  /** 触摸点的标识符 */
  var identifier: Double = js.native
  
  /** 距离文档左上角的距离，文档的左上角为原点，横向为 X 轴 */
  var pageX: Double = js.native
  
  /** 距离文档左上角的距离，文档的左上角为原点，纵向为 Y 轴 */
  var pageY: Double = js.native
}
object TouchDetail {
  
  @scala.inline
  def apply(clientX: Double, clientY: Double, identifier: Double, pageX: Double, pageY: Double): TouchDetail = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchDetail]
  }
  
  @scala.inline
  implicit class TouchDetailMutableBuilder[Self <: TouchDetail] (val x: Self) extends AnyVal {
    
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
