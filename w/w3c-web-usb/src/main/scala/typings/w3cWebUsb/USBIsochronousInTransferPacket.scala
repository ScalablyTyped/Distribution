package typings.w3cWebUsb

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait USBIsochronousInTransferPacket extends js.Object {
  val data: js.UndefOr[DataView] = js.native
  val status: js.UndefOr[USBTransferStatus] = js.native
}

object USBIsochronousInTransferPacket {
  @scala.inline
  def apply(): USBIsochronousInTransferPacket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[USBIsochronousInTransferPacket]
  }
  @scala.inline
  implicit class USBIsochronousInTransferPacketOps[Self <: USBIsochronousInTransferPacket] (val x: Self) extends AnyVal {
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
    def setData(value: DataView): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setStatus(value: USBTransferStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

