package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketTask extends js.Object {
  /**
    * 关闭 WebSocket 连接
    */
  def close(options: CloseSocketOptions): scala.Unit
  /**
    * 监听 WebSocket 连接关闭事件
    */
  def onClose(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 监听 WebSocket 错误
    */
  def onError(callback: js.Function1[/* result */ GeneralCallbackResult, scala.Unit]): scala.Unit
  /**
    * 监听WebSocket接受到服务器的消息事件
    */
  def onMessage(callback: js.Function1[/* result */ OnSocketMessageCallbackResult, scala.Unit]): scala.Unit
  /**
    * 监听 WebSocket 连接打开事件
    */
  def onOpen(callback: js.Function1[/* result */ OnSocketOpenCallbackResult, scala.Unit]): scala.Unit
  /**
    * 通过 WebSocket 连接发送数据
    */
  def send(options: SendSocketMessageOptions): scala.Unit
}

object SocketTask {
  @scala.inline
  def apply(
    close: CloseSocketOptions => scala.Unit,
    onClose: js.Function0[scala.Unit] => scala.Unit,
    onError: js.Function1[/* result */ GeneralCallbackResult, scala.Unit] => scala.Unit,
    onMessage: js.Function1[/* result */ OnSocketMessageCallbackResult, scala.Unit] => scala.Unit,
    onOpen: js.Function1[/* result */ OnSocketOpenCallbackResult, scala.Unit] => scala.Unit,
    send: SendSocketMessageOptions => scala.Unit
  ): SocketTask = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), onClose = js.Any.fromFunction1(onClose), onError = js.Any.fromFunction1(onError), onMessage = js.Any.fromFunction1(onMessage), onOpen = js.Any.fromFunction1(onOpen), send = js.Any.fromFunction1(send))
  
    __obj.asInstanceOf[SocketTask]
  }
}

