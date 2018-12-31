package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SocketTask")
@js.native
class SocketTask () extends js.Object {
  /**
    * 关闭WebSocket连接
    */
  def close(param: wegameDashApiLib.wxNs.typesNs.SocketCloseParams): scala.Unit = js.native
  /**
    * 监听WebSocket 连接关闭事件
    */
  def onClose(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 监听WebSocket 错误事件
    */
  def onError(callback: wegameDashApiLib.wxNs.typesNs.SocketErrorCallback): scala.Unit = js.native
  /**
    * 监听WebSocket 接受到服务器的消息事件
    */
  def onMessage(callback: wegameDashApiLib.wxNs.typesNs.SocketMessageCallback): scala.Unit = js.native
  /**
    * 监听WebSocket 连接打开事件
    */
  def onOpen(callback: wegameDashApiLib.wxNs.typesNs.SocketOpenCallback): scala.Unit = js.native
  /**
    * 通过WebSocket发送数据
    */
  def send(param: wegameDashApiLib.wxNs.typesNs.SocketSendParams): scala.Unit = js.native
}

