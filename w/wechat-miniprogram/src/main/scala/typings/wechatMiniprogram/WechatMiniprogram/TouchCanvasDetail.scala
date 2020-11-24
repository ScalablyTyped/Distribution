package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** canvas Touch 对象 */
@js.native
trait TouchCanvasDetail extends js.Object {
  
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
  implicit class TouchCanvasDetailOps[Self <: TouchCanvasDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdentifier(value: Double): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
