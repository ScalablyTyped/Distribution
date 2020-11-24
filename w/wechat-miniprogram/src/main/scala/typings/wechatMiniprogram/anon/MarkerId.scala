package typings.wechatMiniprogram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerId extends js.Object {
  
  /** 标记点 ID */
  var markerId: Double = js.native
}
object MarkerId {
  
  @scala.inline
  def apply(markerId: Double): MarkerId = {
    val __obj = js.Dynamic.literal(markerId = markerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerId]
  }
  
  @scala.inline
  implicit class MarkerIdOps[Self <: MarkerId] (val x: Self) extends AnyVal {
    
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
    def setMarkerId(value: Double): Self = this.set("markerId", value.asInstanceOf[js.Any])
  }
}
