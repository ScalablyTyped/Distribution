package typings.wegameApi.wx.types

import typings.std.ArrayBuffer
import typings.wegameApi.anon.Address
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
  var remoteInfo: Address
}

object UDPMessage {
  @scala.inline
  def apply(message: ArrayBuffer, remoteInfo: Address): UDPMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], remoteInfo = remoteInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[UDPMessage]
  }
}

