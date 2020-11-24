package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UDPSocket extends js.Object {
  
  /** [number UDPSocket.bind(number port)](https://developers.weixin.qq.com/miniprogram/dev/api/network/udp/UDPSocket.bind.html)
    *
    * 绑定一个系统随机分配的可用端口，或绑定一个指定的端口号 */
  def bind(): Double = js.native
  def bind(/** 指定要绑定的端口号，不传则返回系统随机分配的可用端口
    *
    * 最低基础库： `2.9.0` */
  port: Double): Double = js.native
  
  /** [UDPSocket.close()](https://developers.weixin.qq.com/miniprogram/dev/api/network/udp/UDPSocket.close.html)
    *
    * 关闭 UDP Socket 实例，相当于销毁。 在关闭之后，UDP Socket 实例不能再发送消息，每次调用 `UDPSocket.send` 将会触发错误事件，并且 message 事件回调函数也不会再也执行。在 `UDPSocket` 实例被创建后将被 Native 强引用，保证其不被 GC。在 `UDPSocket.close` 后将解除对其的强引用，让 UDPSocket 实例遵从 GC。 */
  def close(): Unit = js.native
  
  /** [UDPSocket.offClose(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/udp/UDPSocket.offClose.html)
    *
    * 取消监听关闭事件 */
  def offClose(): Unit = js.native
  def offClose(/** 关闭事件的回调函数 */
  callback: UDPSocketOffCloseCallback): Unit = js.native
  
  /** [UDPSocket.offError(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/udp/UDPSocket.offError.html)
    *
    * 取消监听错误事件 */
  def offError(): Unit = js.native
  def offError(/** 错误事件的回调函数 */
  callback: UDPSocketOffErrorCallback): Unit = js.native
  
  /** [UDPSocket.offListening(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/udp/UDPSocket.offListening.html)
    *
    * 取消监听开始监听数据包消息的事件 */
  def offListening(): Unit = js.native
  def offListening(/** 开始监听数据包消息的事件的回调函数 */
  callback: OffListeningCallback): Unit = js.native
  
  /** [UDPSocket.offMessage(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/udp/UDPSocket.offMessage.html)
    *
    * 取消监听收到消息的事件 */
  def offMessage(): Unit = js.native
  def offMessage(/** 收到消息的事件的回调函数 */
  callback: OffMessageCallback): Unit = js.native
  
  /** [UDPSocket.onClose(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/udp/UDPSocket.onClose.html)
    *
    * 监听关闭事件 */
  def onClose(/** 关闭事件的回调函数 */
  callback: UDPSocketOnCloseCallback): Unit = js.native
  
  /** [UDPSocket.onError(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/udp/UDPSocket.onError.html)
    *
    * 监听错误事件 */
  def onError(/** 错误事件的回调函数 */
  callback: UDPSocketOnErrorCallback): Unit = js.native
  
  /** [UDPSocket.onListening(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/udp/UDPSocket.onListening.html)
    *
    * 监听开始监听数据包消息的事件 */
  def onListening(/** 开始监听数据包消息的事件的回调函数 */
  callback: OnListeningCallback): Unit = js.native
  
  /** [UDPSocket.onMessage(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/udp/UDPSocket.onMessage.html)
    *
    * 监听收到消息的事件 */
  def onMessage(/** 收到消息的事件的回调函数 */
  callback: UDPSocketOnMessageCallback): Unit = js.native
  
  /** [UDPSocket.send(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/network/udp/UDPSocket.send.html)
    *
    * 向指定的 IP 和 port 发送消息 */
  def send(option: UDPSocketSendOption): Unit = js.native
}
