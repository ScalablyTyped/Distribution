package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketTask extends StObject {
  
  /** [SocketTask.close(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/SocketTask.close.html)
    *
    * 关闭 WebSocket 连接 */
  def close(option: SocketTaskCloseOption): Unit = js.native
  
  /** [SocketTask.onClose(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/SocketTask.onClose.html)
    *
    * 监听 WebSocket 连接关闭事件 */
  def onClose(/** WebSocket 连接关闭事件的回调函数 */
  callback: SocketTaskOnCloseCallback): Unit = js.native
  
  /** [SocketTask.onError(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/SocketTask.onError.html)
    *
    * 监听 WebSocket 错误事件 */
  def onError(/** WebSocket 错误事件的回调函数 */
  callback: UDPSocketOnErrorCallback): Unit = js.native
  
  /** [SocketTask.onMessage(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/SocketTask.onMessage.html)
    *
    * 监听 WebSocket 接受到服务器的消息事件 */
  def onMessage(/** WebSocket 接受到服务器的消息事件的回调函数 */
  callback: SocketTaskOnMessageCallback): Unit = js.native
  
  /** [SocketTask.onOpen(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/SocketTask.onOpen.html)
    *
    * 监听 WebSocket 连接打开事件 */
  def onOpen(/** WebSocket 连接打开事件的回调函数 */
  callback: OnOpenCallback): Unit = js.native
  
  /** [SocketTask.send(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/SocketTask.send.html)
    *
    * 通过 WebSocket 连接发送数据 */
  def send(option: SocketTaskSendOption): Unit = js.native
}
object SocketTask {
  
  @scala.inline
  def apply(
    close: SocketTaskCloseOption => Unit,
    onClose: SocketTaskOnCloseCallback => Unit,
    onError: UDPSocketOnErrorCallback => Unit,
    onMessage: SocketTaskOnMessageCallback => Unit,
    onOpen: OnOpenCallback => Unit,
    send: SocketTaskSendOption => Unit
  ): SocketTask = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), onClose = js.Any.fromFunction1(onClose), onError = js.Any.fromFunction1(onError), onMessage = js.Any.fromFunction1(onMessage), onOpen = js.Any.fromFunction1(onOpen), send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[SocketTask]
  }
  
  @scala.inline
  implicit class SocketTaskMutableBuilder[Self <: SocketTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: SocketTaskCloseOption => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClose(value: SocketTaskOnCloseCallback => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnError(value: UDPSocketOnErrorCallback => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMessage(value: SocketTaskOnMessageCallback => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpen(value: OnOpenCallback => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSend(value: SocketTaskSendOption => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
  }
}
