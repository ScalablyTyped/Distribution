package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestTask extends js.Object {
  /** [RequestTask.abort()](https://developers.weixin.qq.com/miniprogram/dev/api/network/request/RequestTask.abort.html)
    *
    * 中断请求任务
    *
    * 最低基础库： `1.4.0` */
  def abort(): Unit = js.native
  /** [RequestTask.offHeadersReceived(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/request/RequestTask.offHeadersReceived.html)
    *
    * 取消监听 HTTP Response Header 事件
    *
    * 最低基础库： `2.1.0` */
  def offHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: OffHeadersReceivedCallback): Unit = js.native
  /** [RequestTask.onHeadersReceived(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/request/RequestTask.onHeadersReceived.html)
    *
    * 监听 HTTP Response Header 事件。会比请求完成事件更早
    *
    * 最低基础库： `2.1.0` */
  def onHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: OnHeadersReceivedCallback): Unit = js.native
}

object RequestTask {
  @scala.inline
  def apply(
    abort: () => Unit,
    offHeadersReceived: OffHeadersReceivedCallback => Unit,
    onHeadersReceived: OnHeadersReceivedCallback => Unit
  ): RequestTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), offHeadersReceived = js.Any.fromFunction1(offHeadersReceived), onHeadersReceived = js.Any.fromFunction1(onHeadersReceived))
    __obj.asInstanceOf[RequestTask]
  }
  @scala.inline
  implicit class RequestTaskOps[Self <: RequestTask] (val x: Self) extends AnyVal {
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
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    @scala.inline
    def setOffHeadersReceived(value: OffHeadersReceivedCallback => Unit): Self = this.set("offHeadersReceived", js.Any.fromFunction1(value))
    @scala.inline
    def setOnHeadersReceived(value: OnHeadersReceivedCallback => Unit): Self = this.set("onHeadersReceived", js.Any.fromFunction1(value))
  }
  
}

