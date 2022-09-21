package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBIsochronousInTransferResult extends StObject {
  
  val data: js.UndefOr[js.typedarray.DataView] = js.undefined
  
  val packets: js.Array[USBIsochronousInTransferPacket]
}
object USBIsochronousInTransferResult {
  
  inline def apply(packets: js.Array[USBIsochronousInTransferPacket]): USBIsochronousInTransferResult = {
    val __obj = js.Dynamic.literal(packets = packets.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBIsochronousInTransferResult]
  }
  
  extension [Self <: USBIsochronousInTransferResult](x: Self) {
    
    inline def setData(value: js.typedarray.DataView): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setPackets(value: js.Array[USBIsochronousInTransferPacket]): Self = StObject.set(x, "packets", value.asInstanceOf[js.Any])
    
    inline def setPacketsVarargs(value: USBIsochronousInTransferPacket*): Self = StObject.set(x, "packets", js.Array(value*))
  }
}
