package typings.wegameApi.global

import typings.wegameApi.wx.types.SocketCloseParams
import typings.wegameApi.wx.types.SocketErrorCallback
import typings.wegameApi.wx.types.SocketMessageCallback
import typings.wegameApi.wx.types.SocketOpenCallback
import typings.wegameApi.wx.types.SocketSendParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SocketTask")
@js.native
class SocketTask ()
  extends typings.wegameApi.SocketTask {
  /**
    * 关闭WebSocket连接
    */
  /* CompleteClass */
  override def close(param: SocketCloseParams): Unit = js.native
  /**
    * 监听WebSocket 连接关闭事件
    */
  /* CompleteClass */
  override def onClose(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听WebSocket 错误事件
    */
  /* CompleteClass */
  override def onError(callback: SocketErrorCallback): Unit = js.native
  /**
    * 监听WebSocket 接受到服务器的消息事件
    */
  /* CompleteClass */
  override def onMessage(callback: SocketMessageCallback): Unit = js.native
  /**
    * 监听WebSocket 连接打开事件
    */
  /* CompleteClass */
  override def onOpen(callback: SocketOpenCallback): Unit = js.native
  /**
    * 通过WebSocket发送数据
    */
  /* CompleteClass */
  override def send(param: SocketSendParams): Unit = js.native
}

