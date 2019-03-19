package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Worker extends js.Object {
  /**
    * 监听 Worker 线程向当前线程发送的消息
    */
  def onMessage(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 向 Worker 线程发送的消息。
    */
  def postMessage(message: js.Any): scala.Unit
  /**
    * 结束当前 Worker 线程，仅限在主线程 Worker 实例上调用。
    */
  def terminate(): scala.Unit
}

object Worker {
  @scala.inline
  def apply(
    onMessage: js.Function0[scala.Unit] => scala.Unit,
    postMessage: js.Any => scala.Unit,
    terminate: () => scala.Unit
  ): Worker = {
    val __obj = js.Dynamic.literal(onMessage = js.Any.fromFunction1(onMessage), postMessage = js.Any.fromFunction1(postMessage), terminate = js.Any.fromFunction0(terminate))
  
    __obj.asInstanceOf[Worker]
  }
}

