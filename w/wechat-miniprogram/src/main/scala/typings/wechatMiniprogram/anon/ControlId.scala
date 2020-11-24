package typings.wechatMiniprogram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlId extends js.Object {
  
  /** 控件 ID */
  var controlId: Double = js.native
}
object ControlId {
  
  @scala.inline
  def apply(controlId: Double): ControlId = {
    val __obj = js.Dynamic.literal(controlId = controlId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlId]
  }
  
  @scala.inline
  implicit class ControlIdOps[Self <: ControlId] (val x: Self) extends AnyVal {
    
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
    def setControlId(value: Double): Self = this.set("controlId", value.asInstanceOf[js.Any])
  }
}
