package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketTask extends js.Object {
  /**
    * 关闭 WebSocket 连接
    */
  def close(): Unit = js.native
  def close(options: CloseSocketOptions): Unit = js.native
  /**
    * 监听 WebSocket 连接关闭事件
    */
  def onClose(): Unit = js.native
  def onClose(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听 WebSocket 错误
    */
  def onError(): Unit = js.native
  def onError(callback: js.Function1[/* result */ GeneralCallbackResult, Unit]): Unit = js.native
  /**
    * 监听WebSocket接受到服务器的消息事件
    */
  def onMessage(): Unit = js.native
  def onMessage(callback: js.Function1[/* result */ OnSocketMessageCallbackResult, Unit]): Unit = js.native
  /**
    * 监听 WebSocket 连接打开事件
    */
  def onOpen(): Unit = js.native
  def onOpen(callback: js.Function1[/* result */ OnSocketOpenCallbackResult, Unit]): Unit = js.native
  /**
    * 通过 WebSocket 连接发送数据
    */
  def send(): Unit = js.native
  def send(options: SendSocketMessageOptions): Unit = js.native
}

