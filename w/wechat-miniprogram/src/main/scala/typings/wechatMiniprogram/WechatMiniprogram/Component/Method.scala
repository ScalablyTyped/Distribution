package typings.wechatMiniprogram.WechatMiniprogram.Component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Method[M /* <: MethodOption */] extends js.Object {
  /** 组件的方法，包括事件响应函数和任意的自定义方法，关于事件响应函数的使用，参见 [组件间通信与事件](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/events.html) */
  var methods: M = js.native
}

object Method {
  @scala.inline
  def apply[/* <: typings.wechatMiniprogram.WechatMiniprogram.Component.MethodOption */ M](methods: M): Method[M] = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method[M]]
  }
  @scala.inline
  implicit class MethodOps[Self <: Method[_], /* <: typings.wechatMiniprogram.WechatMiniprogram.Component.MethodOption */ M] (val x: Self with Method[M]) extends AnyVal {
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
    def setMethods(value: M): Self = this.set("methods", value.asInstanceOf[js.Any])
  }
  
}

