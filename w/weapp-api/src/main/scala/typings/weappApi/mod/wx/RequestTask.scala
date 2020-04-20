package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 网络请求任务对象
  */
trait RequestTask extends js.Object {
  //  中断请求任务
  def abort(): Unit
  //  取消监听 HTTP Response Header 事件
  def offHeadersReceived(callback: DataResponseCallback): Unit
  //  监听 HTTP Response Header 事件。会比请求完成事件更早
  def onHeadersReceived(callback: DataResponseCallback): Unit
}

object RequestTask {
  @scala.inline
  def apply(
    abort: () => Unit,
    offHeadersReceived: DataResponseCallback => Unit,
    onHeadersReceived: DataResponseCallback => Unit
  ): RequestTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), offHeadersReceived = js.Any.fromFunction1(offHeadersReceived), onHeadersReceived = js.Any.fromFunction1(onHeadersReceived))
    __obj.asInstanceOf[RequestTask]
  }
}

