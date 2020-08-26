package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventChannel extends js.Object {
  /** [EventChannel.emit(string eventName, any args)](https://developers.weixin.qq.com/miniprogram/dev/api/route/EventChannel.emit.html)
    *
    * 触发一个事件
    *
    * 最低基础库： `2.7.3` */
  def emit(
    /** 事件名称 */
  eventName: String,
    /** 事件参数 */
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): Unit = js.native
  /** [EventChannel.off(string eventName, function fn)](https://developers.weixin.qq.com/miniprogram/dev/api/route/EventChannel.off.html)
    *
    * 取消监听一个事件。给出第二个参数时，只取消给出的监听函数，否则取消所有监听函数
    *
    * 最低基础库： `2.7.3` */
  def off(/** 事件名称 */
  eventName: String, /** 事件监听函数 */
  fn: EventCallback): Unit = js.native
  /** [EventChannel.on(string eventName, function fn)](https://developers.weixin.qq.com/miniprogram/dev/api/route/EventChannel.on.html)
    *
    * 持续监听一个事件
    *
    * 最低基础库： `2.7.3` */
  def on(/** 事件名称 */
  eventName: String, /** 事件监听函数 */
  fn: EventCallback): Unit = js.native
  /** [EventChannel.once(string eventName, function fn)](https://developers.weixin.qq.com/miniprogram/dev/api/route/EventChannel.once.html)
    *
    * 监听一个事件一次，触发后失效
    *
    * 最低基础库： `2.7.3` */
  def once(/** 事件名称 */
  eventName: String, /** 事件监听函数 */
  fn: EventCallback): Unit = js.native
}

object EventChannel {
  @scala.inline
  def apply(
    emit: (String, js.Any) => Unit,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    once: (String, EventCallback) => Unit
  ): EventChannel = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once))
    __obj.asInstanceOf[EventChannel]
  }
  @scala.inline
  implicit class EventChannelOps[Self <: EventChannel] (val x: Self) extends AnyVal {
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
    def setEmit(value: (String, js.Any) => Unit): Self = this.set("emit", js.Any.fromFunction2(value))
    @scala.inline
    def setOff(value: (String, EventCallback) => Unit): Self = this.set("off", js.Any.fromFunction2(value))
    @scala.inline
    def setOn(value: (String, EventCallback) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    @scala.inline
    def setOnce(value: (String, EventCallback) => Unit): Self = this.set("once", js.Any.fromFunction2(value))
  }
  
}

