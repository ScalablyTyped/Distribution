package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBIsochronousOutTransferResult extends StObject {
  
  val packets: js.Array[USBIsochronousOutTransferPacket]
}
object USBIsochronousOutTransferResult {
  
  @scala.inline
  def apply(packets: js.Array[USBIsochronousOutTransferPacket]): USBIsochronousOutTransferResult = {
    val __obj = js.Dynamic.literal(packets = packets.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBIsochronousOutTransferResult]
  }
  
  @scala.inline
  implicit class USBIsochronousOutTransferResultMutableBuilder[Self <: USBIsochronousOutTransferResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPackets(value: js.Array[USBIsochronousOutTransferPacket]): Self = StObject.set(x, "packets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketsVarargs(value: USBIsochronousOutTransferPacket*): Self = StObject.set(x, "packets", js.Array(value :_*))
  }
}
