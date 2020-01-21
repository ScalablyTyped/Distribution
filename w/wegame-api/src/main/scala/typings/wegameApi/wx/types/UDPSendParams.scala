package typings.wegameApi.wx.types

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UDPSendParams extends js.Object {
  /**
    * 要发消息的地址。可以是一个和本机同网段的 IP 地址，也可以是在安全域名列表内的域名地址
    */
  var address: String
  /**
    * 发送数据的长度，仅当 message 为 ArrayBuffer 类型时有效，默认值message.byteLength
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * 要发送的数据
    */
  var message: String | ArrayBuffer
  /**
    * 发送数据的偏移量，仅当 message 为 ArrayBuffer 类型时有效，默认值0
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * 要发送消息的端口号
    */
  var port: Double
}

object UDPSendParams {
  @scala.inline
  def apply(
    address: String,
    message: String | ArrayBuffer,
    port: Double,
    length: Int | Double = null,
    offset: Int | Double = null
  ): UDPSendParams = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[UDPSendParams]
  }
}

