package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketTask extends js.Object {
  /**
    * 关闭 WebSocket 连接
    */
  def close(): scala.Unit = js.native
  def close(options: CloseSocketOptions): scala.Unit = js.native
  /**
    * 监听 WebSocket 连接关闭事件
    */
  def onClose(): scala.Unit = js.native
  def onClose(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 监听 WebSocket 错误
    */
  def onError(): scala.Unit = js.native
  def onError(callback: js.Function1[/* result */ GeneralCallbackResult, scala.Unit]): scala.Unit = js.native
  /**
    * 监听WebSocket接受到服务器的消息事件
    */
  def onMessage(): scala.Unit = js.native
  def onMessage(callback: js.Function1[/* result */ OnSocketMessageCallbackResult, scala.Unit]): scala.Unit = js.native
  /**
    * 监听 WebSocket 连接打开事件
    */
  def onOpen(): scala.Unit = js.native
  def onOpen(callback: js.Function1[/* result */ OnSocketOpenCallbackResult, scala.Unit]): scala.Unit = js.native
  /**
    * 通过 WebSocket 连接发送数据
    */
  def send(): scala.Unit = js.native
  def send(options: SendSocketMessageOptions): scala.Unit = js.native
}

