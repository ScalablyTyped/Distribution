package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBIsochronousOutTransferPacket extends StObject {
  
  val bytesWritten: Double
  
  val status: USBTransferStatus
}
object USBIsochronousOutTransferPacket {
  
  @scala.inline
  def apply(bytesWritten: Double, status: USBTransferStatus): USBIsochronousOutTransferPacket = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBIsochronousOutTransferPacket]
  }
  
  @scala.inline
  implicit class USBIsochronousOutTransferPacketMutableBuilder[Self <: USBIsochronousOutTransferPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: USBTransferStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
