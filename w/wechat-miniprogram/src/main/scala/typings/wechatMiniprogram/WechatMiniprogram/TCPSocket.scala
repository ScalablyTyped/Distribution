package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TCPSocket extends StObject {
  
  /** [TCPSocket.close()](https://developers.weixin.qq.com/miniprogram/dev/api/network/tcp/TCPSocket.close.html)
    *
    * 关闭连接 */
  def close(): Unit = js.native
  
  /** [TCPSocket.connect(Object options)](https://developers.weixin.qq.com/miniprogram/dev/api/network/tcp/TCPSocket.connect.html)
    *
    * 在给定的套接字上启动连接 */
  def connect(options: TCPSocketConnectOption): Unit = js.native
  
  /** [TCPSocket.offClose(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/tcp/TCPSocket.offClose.html)
    *
    * 取消监听一旦 socket 完全关闭就发出该事件 */
  def offClose(): Unit = js.native
  def offClose(/** 一旦 socket 完全关闭就发出该事件的回调函数 */
  callback: UDPSocketOffCloseCallback): Unit = js.native
  
  /** [TCPSocket.offConnect(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/tcp/TCPSocket.offConnect.html)
    *
    * 取消监听当一个 socket 连接成功建立的时候触发该事件 */
  def offConnect(): Unit = js.native
  def offConnect(/** 当一个 socket 连接成功建立的时候触发该事件的回调函数 */
  callback: OffConnectCallback): Unit = js.native
  
  /** [TCPSocket.offError(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/tcp/TCPSocket.offError.html)
    *
    * 取消监听当错误发生时触发 */
  def offError(): Unit = js.native
  def offError(/** 的回调函数 */
  callback: UDPSocketOffErrorCallback): Unit = js.native
  
  /** [TCPSocket.offMessage(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/tcp/TCPSocket.offMessage.html)
    *
    * 取消监听当接收到数据的时触发该事件 */
  def offMessage(): Unit = js.native
  def offMessage(/** 当接收到数据的时触发该事件的回调函数 */
  callback: TCPSocketOffMessageCallback): Unit = js.native
  
  /** [TCPSocket.onClose(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/tcp/TCPSocket.onClose.html)
    *
    * 监听一旦 socket 完全关闭就发出该事件 */
  def onClose(/** 一旦 socket 完全关闭就发出该事件的回调函数 */
  callback: UDPSocketOnCloseCallback): Unit = js.native
  
  /** [TCPSocket.onConnect(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/tcp/TCPSocket.onConnect.html)
    *
    * 监听当一个 socket 连接成功建立的时候触发该事件 */
  def onConnect(/** 当一个 socket 连接成功建立的时候触发该事件的回调函数 */
  callback: OnConnectCallback): Unit = js.native
  
  /** [TCPSocket.onError(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/tcp/TCPSocket.onError.html)
    *
    * 监听当错误发生时触发 */
  def onError(/** 的回调函数 */
  callback: UDPSocketOnErrorCallback): Unit = js.native
  
  /** [TCPSocket.onMessage(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/tcp/TCPSocket.onMessage.html)
    *
    * 监听当接收到数据的时触发该事件 */
  def onMessage(/** 当接收到数据的时触发该事件的回调函数 */
  callback: TCPSocketOnMessageCallback): Unit = js.native
  
  /** [TCPSocket.write(String | ArrayBuffer data)](https://developers.weixin.qq.com/miniprogram/dev/api/network/tcp/TCPSocket.write.html)
    *
    * 在 socket 上发送数据 */
  def write(/** 要发送的数据 */
  data: String): Unit = js.native
  def write(/** 要发送的数据 */
  data: js.typedarray.ArrayBuffer): Unit = js.native
}
