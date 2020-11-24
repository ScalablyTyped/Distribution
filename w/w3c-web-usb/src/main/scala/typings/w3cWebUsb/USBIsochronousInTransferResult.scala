package typings.w3cWebUsb

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USBIsochronousInTransferResult extends js.Object {
  
  val data: js.UndefOr[DataView] = js.native
  
  val packets: js.Array[USBIsochronousInTransferPacket] = js.native
}
object USBIsochronousInTransferResult {
  
  @scala.inline
  def apply(packets: js.Array[USBIsochronousInTransferPacket]): USBIsochronousInTransferResult = {
    val __obj = js.Dynamic.literal(packets = packets.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBIsochronousInTransferResult]
  }
  
  @scala.inline
  implicit class USBIsochronousInTransferResultOps[Self <: USBIsochronousInTransferResult] (val x: Self) extends AnyVal {
    
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
    def setPacketsVarargs(value: USBIsochronousInTransferPacket*): Self = this.set("packets", js.Array(value :_*))
    
    @scala.inline
    def setPackets(value: js.Array[USBIsochronousInTransferPacket]): Self = this.set("packets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: DataView): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
