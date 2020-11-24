package typings.wegameApi

import typings.wegameApi.wx.types.SocketCloseParams
import typings.wegameApi.wx.types.SocketErrorCallback
import typings.wegameApi.wx.types.SocketMessageCallback
import typings.wegameApi.wx.types.SocketOpenCallback
import typings.wegameApi.wx.types.SocketSendParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketTask extends js.Object {
  
  /**
    * 关闭WebSocket连接
    */
  def close(param: SocketCloseParams): Unit = js.native
  
  /**
    * 监听WebSocket 连接关闭事件
    */
  def onClose(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 监听WebSocket 错误事件
    */
  def onError(callback: SocketErrorCallback): Unit = js.native
  
  /**
    * 监听WebSocket 接受到服务器的消息事件
    */
  def onMessage(callback: SocketMessageCallback): Unit = js.native
  
  /**
    * 监听WebSocket 连接打开事件
    */
  def onOpen(callback: SocketOpenCallback): Unit = js.native
  
  /**
    * 通过WebSocket发送数据
    */
  def send(param: SocketSendParams): Unit = js.native
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
  
  @scala.inline
  implicit class SocketTaskOps[Self <: SocketTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClose(value: SocketCloseParams => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClose(value: js.Function0[Unit] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnError(value: SocketErrorCallback => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMessage(value: SocketMessageCallback => Unit): Self = this.set("onMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpen(value: SocketOpenCallback => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSend(value: SocketSendParams => Unit): Self = this.set("send", js.Any.fromFunction1(value))
  }
}
