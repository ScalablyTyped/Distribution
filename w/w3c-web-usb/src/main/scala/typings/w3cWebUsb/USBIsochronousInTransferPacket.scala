package typings.w3cWebUsb

import typings.std.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBIsochronousInTransferPacket extends StObject {
  
  val data: js.UndefOr[DataView] = js.undefined
  
  val status: js.UndefOr[USBTransferStatus] = js.undefined
}
object USBIsochronousInTransferPacket {
  
  @scala.inline
  def apply(): USBIsochronousInTransferPacket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[USBIsochronousInTransferPacket]
  }
  
  @scala.inline
  implicit class USBIsochronousInTransferPacketMutableBuilder[Self <: USBIsochronousInTransferPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: DataView): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setStatus(value: USBTransferStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
