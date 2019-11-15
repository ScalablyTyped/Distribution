package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
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

object Anon_Address {
  @scala.inline
  def apply(address: String, family: String, port: Double, size: Double): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, family = family, port = port, size = size)
  
    __obj.asInstanceOf[Anon_Address]
  }
}

