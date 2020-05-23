package typings.wegameApi

import typings.wegameApi.wx.types.SocketCloseParams
import typings.wegameApi.wx.types.SocketErrorCallback
import typings.wegameApi.wx.types.SocketMessageCallback
import typings.wegameApi.wx.types.SocketOpenCallback
import typings.wegameApi.wx.types.SocketSendParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketTask extends js.Object {
  /**
    * 关闭WebSocket连接
    */
  def close(param: SocketCloseParams): Unit
  /**
    * 监听WebSocket 连接关闭事件
    */
  def onClose(callback: js.Function0[Unit]): Unit
  /**
    * 监听WebSocket 错误事件
    */
  def onError(callback: SocketErrorCallback): Unit
  /**
    * 监听WebSocket 接受到服务器的消息事件
    */
  def onMessage(callback: SocketMessageCallback): Unit
  /**
    * 监听WebSocket 连接打开事件
    */
  def onOpen(callback: SocketOpenCallback): Unit
  /**
    * 通过WebSocket发送数据
    */
  def send(param: SocketSendParams): Unit
}

object SocketTask {
  @scala.inline
  def apply(
    close: SocketCloseParams => Unit,
    onClose: js.Function0[Unit] => Unit,
    onError: SocketErrorCallback => Unit,
    onMessage: SocketMessageCallback => Unit,
    onOpen: SocketOpenCallback => Unit,
    send: SocketSendParams => Unit
  ): SocketTask = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), onClose = js.Any.fromFunction1(onClose), onError = js.Any.fromFunction1(onError), onMessage = js.Any.fromFunction1(onMessage), onOpen = js.Any.fromFunction1(onOpen), send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[SocketTask]
  }
}

