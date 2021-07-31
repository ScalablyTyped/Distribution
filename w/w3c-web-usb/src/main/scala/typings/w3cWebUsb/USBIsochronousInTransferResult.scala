package typings.w3cWebUsb

import typings.std.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBIsochronousInTransferResult extends StObject {
  
  val data: js.UndefOr[DataView] = js.undefined
  
  val packets: js.Array[USBIsochronousInTransferPacket]
}
object USBIsochronousInTransferResult {
  
  @scala.inline
  def apply(packets: js.Array[USBIsochronousInTransferPacket]): USBIsochronousInTransferResult = {
    val __obj = js.Dynamic.literal(packets = packets.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBIsochronousInTransferResult]
  }
  
  @scala.inline
  implicit class USBIsochronousInTransferResultMutableBuilder[Self <: USBIsochronousInTransferResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: DataView): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setPackets(value: js.Array[USBIsochronousInTransferPacket]): Self = StObject.set(x, "packets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketsVarargs(value: USBIsochronousInTransferPacket*): Self = StObject.set(x, "packets", js.Array(value :_*))
  }
}
