package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Worker extends js.Object {
  /**
    * 监听 Worker 线程向当前线程发送的消息
    */
  def onMessage(): scala.Unit = js.native
  def onMessage(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 向 Worker 线程发送的消息。
    */
  def postMessage(): scala.Unit = js.native
  def postMessage(message: js.Any): scala.Unit = js.native
  /**
    * 结束当前 Worker 线程，仅限在主线程 Worker 实例上调用。
    */
  def terminate(): scala.Unit = js.native
}

