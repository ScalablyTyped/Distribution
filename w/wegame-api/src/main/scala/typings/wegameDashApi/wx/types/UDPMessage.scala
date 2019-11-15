package typings.wegameDashApi.wx.types

import typings.std.ArrayBuffer
import typings.wegameDashApi.Anon_Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UDPMessage extends js.Object {
  /**
    * 收到的消息
    */
  var message: ArrayBuffer
  /**
    * 消息来源的结构化信息
    */
  var remoteInfo: Anon_Address
}

object UDPMessage {
  @scala.inline
  def apply(message: ArrayBuffer, remoteInfo: Anon_Address): UDPMessage = {
    val __obj = js.Dynamic.literal(message = message, remoteInfo = remoteInfo)
  
    __obj.asInstanceOf[UDPMessage]
  }
}

