package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBIsochronousOutTransferResult extends StObject {
  
  val packets: js.Array[USBIsochronousOutTransferPacket]
}
object USBIsochronousOutTransferResult {
  
  inline def apply(packets: js.Array[USBIsochronousOutTransferPacket]): USBIsochronousOutTransferResult = {
    val __obj = js.Dynamic.literal(packets = packets.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBIsochronousOutTransferResult]
  }
  
  extension [Self <: USBIsochronousOutTransferResult](x: Self) {
    
    inline def setPackets(value: js.Array[USBIsochronousOutTransferPacket]): Self = StObject.set(x, "packets", value.asInstanceOf[js.Any])
    
    inline def setPacketsVarargs(value: USBIsochronousOutTransferPacket*): Self = StObject.set(x, "packets", js.Array(value*))
  }
}
