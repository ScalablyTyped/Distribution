package typings.wegameApi.global

import typings.wegameApi.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WxWorker")
@js.native
class WxWorker ()
  extends typings.wegameApi.WxWorker {
  /**
    * 监听接收主线程/Worker 线程向当前线程发送的消息
    * @param callback.res.message 接收主线程/Worker 线程向当前线程发送的消息
    */
  /* CompleteClass */
  override def onMessage(callback: js.Function1[/* res */ Message, Unit]): Unit = js.native
  /**
    * 向主线程或Worker线程发送的消息。
    * @param message 需要发送的消息，必须是一个可序列化的 JavaScript 对象。
    */
  /* CompleteClass */
  override def postMessage(message: js.Any): Unit = js.native
  /**
    * 结束当前 worker 线程，仅限在主线程 worker 对象上调用。
    */
  /* CompleteClass */
  override def terminate(): Unit = js.native
}

