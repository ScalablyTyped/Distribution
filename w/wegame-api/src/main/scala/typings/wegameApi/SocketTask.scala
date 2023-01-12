package typings.wegameApi

import typings.wegameApi.wx.types.SocketCloseParams
import typings.wegameApi.wx.types.SocketErrorCallback
import typings.wegameApi.wx.types.SocketMessageCallback
import typings.wegameApi.wx.types.SocketOpenCallback
import typings.wegameApi.wx.types.SocketSendParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketTask extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: SocketTask] (val x: Self) extends AnyVal {
    
    inline def setClose(value: SocketCloseParams => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setOnClose(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    inline def setOnError(value: SocketErrorCallback => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnMessage(value: SocketMessageCallback => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    inline def setOnOpen(value: SocketOpenCallback => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
    
    inline def setSend(value: SocketSendParams => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
  }
}
