package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target extends js.Object {
  
  var target: typings.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject] = js.native
}
object Target {
  
  @scala.inline
  def apply(target: typings.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject]): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: typings.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject]): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
