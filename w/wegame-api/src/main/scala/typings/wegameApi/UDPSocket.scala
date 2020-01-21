package typings.wegameApi

import typings.wegameApi.wx.types.UDPMessage
import typings.wegameApi.wx.types.UDPSendParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 一个 UDP Socket 实例，默认使用 IPv4 协议。
  * 错误码：
  *    -1  系统错误
  *    -2  socket接口错误
  *    -3  发送失败，无接口权限
  *     1  发送失败，参数错误，address不合法
  *     2  发送失败，参数错误，port不合法
  */
@JSGlobal("UDPSocket")
@js.native
class UDPSocket () extends js.Object {
  /**
    * 绑定一个系统随机分配的可用端口，或绑定一个指定的端口号
    * @param port 需要绑定的端口号，不指定时使用随机端口
    * @returns 绑定成功的端口号
    */
  def bind(): Double = js.native
  def bind(port: Double): Double = js.native
  /**
    * 关闭 UDP Socket 实例，相当于销毁。 在关闭之后，UDP Socket 实例不能再发送消息，每次调用 UDPSocket.send 将会触发错误事件，
    * 并且 message 事件回调函数也不会再执行。在 UDPSocket 实例被创建后将被 Native 强引用，保证其不被 GC。在 UDPSocket.close 后
    * 将解除对其的强引用，让 UDPSocket 实例遵从 GC。
    */
  def close(): Unit = js.native
  /**
    * 清除监听关闭事件回调
    * @param callback 之前监听的函数
    */
  def offClose(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听错误事件
    * @param callback 之前设置的错误回调函数
    */
  def offError(callback: js.Function1[/* res */ AnonErrMsg, Unit]): Unit = js.native
  /**
    * 取消监听开始监听数据包消息的事件
    * @param callback 之前设置的回调函数
    */
  def offListening(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听收到消息的事件
    * @param callback 之前设置的回调函数
    */
  def offMessage(callback: js.Function1[/* res */ UDPMessage, Unit]): Unit = js.native
  /**
    * 设置监听关闭事件回调
    * @param callback 关闭事件的回调函数
    */
  def onClose(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听错误事件
    * @param callback 错误回调函数
    */
  def onError(callback: js.Function1[/* res */ AnonErrMsg, Unit]): Unit = js.native
  /**
    * 监听开始监听数据包消息的事件
    * @param callback 回调函数
    */
  def onListening(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听收到消息的事件
    * @param callback 回调函数
    */
  def onMessage(callback: js.Function1[/* res */ UDPMessage, Unit]): Unit = js.native
  /**
    * 向指定的 IP 和 port 发送消息
    */
  def send(param: UDPSendParams): Unit = js.native
}

