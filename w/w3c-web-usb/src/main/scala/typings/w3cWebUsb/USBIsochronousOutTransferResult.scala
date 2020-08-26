package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait USBIsochronousOutTransferResult extends js.Object {
  val packets: js.Array[USBIsochronousOutTransferPacket] = js.native
}

object USBIsochronousOutTransferResult {
  @scala.inline
  def apply(packets: js.Array[USBIsochronousOutTransferPacket]): USBIsochronousOutTransferResult = {
    val __obj = js.Dynamic.literal(packets = packets.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBIsochronousOutTransferResult]
  }
  @scala.inline
  implicit class USBIsochronousOutTransferResultOps[Self <: USBIsochronousOutTransferResult] (val x: Self) extends AnyVal {
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
    def setPacketsVarargs(value: USBIsochronousOutTransferPacket*): Self = this.set("packets", js.Array(value :_*))
    @scala.inline
    def setPackets(value: js.Array[USBIsochronousOutTransferPacket]): Self = this.set("packets", value.asInstanceOf[js.Any])
  }
  
}

