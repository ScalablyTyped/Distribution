package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBIsochronousInTransferPacket extends StObject {
  
  val data: js.UndefOr[js.typedarray.DataView] = js.undefined
  
  val status: js.UndefOr[USBTransferStatus] = js.undefined
}
object USBIsochronousInTransferPacket {
  
  inline def apply(): USBIsochronousInTransferPacket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[USBIsochronousInTransferPacket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: USBIsochronousInTransferPacket] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.DataView): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setStatus(value: USBTransferStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
