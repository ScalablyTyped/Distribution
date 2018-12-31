package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WxWorker")
@js.native
class WxWorker () extends js.Object {
  /**
    * 监听接收主线程/Worker 线程向当前线程发送的消息
    * @param callback.res.message 接收主线程/Worker 线程向当前线程发送的消息
    */
  def onMessage(callback: js.Function1[/* res */ Anon_Message, scala.Unit]): scala.Unit = js.native
  /**
    * 向主线程或Worker线程发送的消息。
    * @param message 需要发送的消息，必须是一个可序列化的 JavaScript 对象。
    */
  def postMessage(message: js.Any): scala.Unit = js.native
  /**
    * 结束当前 worker 线程，仅限在主线程 worker 对象上调用。
    */
  def terminate(): scala.Unit = js.native
}

