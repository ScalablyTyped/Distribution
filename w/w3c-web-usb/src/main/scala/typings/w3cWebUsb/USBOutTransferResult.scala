package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBOutTransferResult extends StObject {
  
  val bytesWritten: Double
  
  val status: USBTransferStatus
}
object USBOutTransferResult {
  
  inline def apply(bytesWritten: Double, status: USBTransferStatus): USBOutTransferResult = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBOutTransferResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: USBOutTransferResult] (val x: Self) extends AnyVal {
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: USBTransferStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
