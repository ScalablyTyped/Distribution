package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UDPSocket extends StObject {
  
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
  
  /** [UDPSocket.connect(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/network/udp/UDPSocket.connect.html)
    *
    * 预先连接到指定的 IP 和 port，需要配合 write 方法一起使用
    *
    * 最低基础库： `2.15.0` */
  def connect(option: UDPSocketConnectOption): Unit = js.native
  
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
  callback: UDPSocketOffMessageCallback): Unit = js.native
  
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
  
  /** [UDPSocket.setTTL(number ttl)](https://developers.weixin.qq.com/miniprogram/dev/api/network/udp/UDPSocket.setTTL.html)
    *
    * 设置 IP_TTL 套接字选项，用于设置一个 IP 数据包传输时允许的最大跳步数
    *
    * 最低基础库： `2.18.0` */
  def setTTL(/** ttl 参数可以是 0 到 255 之间 */
  ttl: Double): Unit = js.native
  
  /** [UDPSocket.write()](https://developers.weixin.qq.com/miniprogram/dev/api/network/udp/UDPSocket.write.html)
    *
    * 用法与 send 方法相同，如果没有预先调用 connect 则与 send 无差异（注意即使调用了 connect 也需要在本接口填入地址和端口参数）
    *
    * 最低基础库： `2.15.0` */
  def write(): Unit = js.native
}
