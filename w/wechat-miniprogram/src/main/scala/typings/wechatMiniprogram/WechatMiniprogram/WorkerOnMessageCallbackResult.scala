package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerOnMessageCallbackResult extends js.Object {
  /** 主线程/Worker 线程向当前线程发送的消息 */
  var message: IAnyObject = js.native
}

object WorkerOnMessageCallbackResult {
  @scala.inline
  def apply(message: IAnyObject): WorkerOnMessageCallbackResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerOnMessageCallbackResult]
  }
  @scala.inline
  implicit class WorkerOnMessageCallbackResultOps[Self <: WorkerOnMessageCallbackResult] (val x: Self) extends AnyVal {
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
    def setMessage(value: IAnyObject): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

