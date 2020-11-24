package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.wechatMiniprogramStrings.begin
import typings.wechatMiniprogram.wechatMiniprogramStrings.gesture
import typings.wechatMiniprogram.wechatMiniprogramStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CausedBy extends js.Object {
  
  /**
    * 导致视野变化的原因
    *
    * - gesture: 用户手势
    * - update: 调用接口导致
    */
  var causedBy: gesture | update = js.native
  
  /**
    * 视野变化开始、结束时触发
    *
    * 视野变化开始为 `begin`
    */
  var `type`: begin = js.native
}
object CausedBy {
  
  @scala.inline
  def apply(causedBy: gesture | update, `type`: begin): CausedBy = {
    val __obj = js.Dynamic.literal(causedBy = causedBy.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CausedBy]
  }
  
  @scala.inline
  implicit class CausedByOps[Self <: CausedBy] (val x: Self) extends AnyVal {
    
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
    def setCausedBy(value: gesture | update): Self = this.set("causedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: begin): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
