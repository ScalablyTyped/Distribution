package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  /**
    * 发送消息的 socket 的地址
    */
  var address: String
  /**
    * 使用的协议族，为 IPv4 或者 IPv6
    */
  var family: String
  /**
    * 端口号
    */
  var port: Double
  /**
    * message 的大小，单位：字节
    */
  var size: Double
}

object AnonAddress {
  @scala.inline
  def apply(address: String, family: String, port: Double, size: Double): AnonAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddress]
  }
}

