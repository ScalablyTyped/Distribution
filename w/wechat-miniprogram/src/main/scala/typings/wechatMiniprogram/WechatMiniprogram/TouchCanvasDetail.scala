package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** canvas Touch 对象 */
@js.native
trait TouchCanvasDetail extends StObject {
  
  /** 触摸点的标识符 */
  var identifier: Double = js.native
  
  /** 距离 Canvas 左上角的距离，Canvas 的左上角为原点 ，横向为X轴 */
  var x: Double = js.native
  
  /** 距离 Canvas 左上角的距离，Canvas 的左上角为原点 纵向为Y轴 */
  var y: Double = js.native
}
object TouchCanvasDetail {
  
  @scala.inline
  def apply(identifier: Double, x: Double, y: Double): TouchCanvasDetail = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchCanvasDetail]
  }
  
  @scala.inline
  implicit class TouchCanvasDetailMutableBuilder[Self <: TouchCanvasDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: Double): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
