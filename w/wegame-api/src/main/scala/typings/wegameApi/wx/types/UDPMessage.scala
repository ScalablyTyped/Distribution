package typings.wegameApi.wx.types

import typings.std.ArrayBuffer
import typings.wegameApi.AnonAddress
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
  var remoteInfo: AnonAddress
}

object UDPMessage {
  @scala.inline
  def apply(message: ArrayBuffer, remoteInfo: AnonAddress): UDPMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], remoteInfo = remoteInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UDPMessage]
  }
}

