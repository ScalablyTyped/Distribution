package typings.wegameApi.wx.types

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UDPSendParams extends js.Object {
  /**
    * 要发消息的地址。可以是一个和本机同网段的 IP 地址，也可以是在安全域名列表内的域名地址
    */
  var address: String = js.native
  /**
    * 发送数据的长度，仅当 message 为 ArrayBuffer 类型时有效，默认值message.byteLength
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * 要发送的数据
    */
  var message: String | ArrayBuffer = js.native
  /**
    * 发送数据的偏移量，仅当 message 为 ArrayBuffer 类型时有效，默认值0
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * 要发送消息的端口号
    */
  var port: Double = js.native
}

object UDPSendParams {
  @scala.inline
  def apply(address: String, message: String | ArrayBuffer, port: Double): UDPSendParams = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[UDPSendParams]
  }
  @scala.inline
  implicit class UDPSendParamsOps[Self <: UDPSendParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String | ArrayBuffer): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
  
}

