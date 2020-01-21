package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * 返回一个 requestTask 对象，通过 requestTask，可中断请求任务。
	 */
trait RequestTask extends js.Object {
  def abort(): Unit
}

object RequestTask {
  @scala.inline
  def apply(abort: () => Unit): RequestTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
  
    __obj.asInstanceOf[RequestTask]
  }
}

