package typings.wechatMiniprogram.WechatMiniprogram.Component

import typings.wechatMiniprogram.anon.PartialILifetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Method[M /* <: MethodOption */, TIsPage /* <: Boolean */] extends js.Object {
  
  /** 组件的方法，包括事件响应函数和任意的自定义方法，关于事件响应函数的使用，参见 [组件间通信与事件](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/events.html) */
  var methods: M with (js.Object | PartialILifetime) = js.native
}
object Method {
  
  @scala.inline
  def apply[M /* <: MethodOption */, TIsPage /* <: Boolean */](methods: M with (js.Object | PartialILifetime)): Method[M, TIsPage] = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method[M, TIsPage]]
  }
  
  @scala.inline
  implicit class MethodOps[Self <: Method[_, _], M /* <: MethodOption */, TIsPage /* <: Boolean */] (val x: Self with (Method[M, TIsPage])) extends AnyVal {
    
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
    def setMethods(value: M with (js.Object | PartialILifetime)): Self = this.set("methods", value.asInstanceOf[js.Any])
  }
}
