package typings.wegameApi

import typings.wegameApi.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WxWorker extends js.Object {
  /**
    * 监听接收主线程/Worker 线程向当前线程发送的消息
    * @param callback.res.message 接收主线程/Worker 线程向当前线程发送的消息
    */
  def onMessage(callback: js.Function1[/* res */ Message, Unit]): Unit
  /**
    * 向主线程或Worker线程发送的消息。
    * @param message 需要发送的消息，必须是一个可序列化的 JavaScript 对象。
    */
  def postMessage(message: js.Any): Unit
  /**
    * 结束当前 worker 线程，仅限在主线程 worker 对象上调用。
    */
  def terminate(): Unit
}

object WxWorker {
  @scala.inline
  def apply(
    onMessage: js.Function1[/* res */ Message, Unit] => Unit,
    postMessage: js.Any => Unit,
    terminate: () => Unit
  ): WxWorker = {
    val __obj = js.Dynamic.literal(onMessage = js.Any.fromFunction1(onMessage), postMessage = js.Any.fromFunction1(postMessage), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[WxWorker]
  }
}

