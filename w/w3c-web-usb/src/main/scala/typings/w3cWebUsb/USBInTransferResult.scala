package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBInTransferResult extends StObject {
  
  val data: js.UndefOr[js.typedarray.DataView] = js.undefined
  
  val status: js.UndefOr[USBTransferStatus] = js.undefined
}
object USBInTransferResult {
  
  inline def apply(): USBInTransferResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[USBInTransferResult]
  }
  
  extension [Self <: USBInTransferResult](x: Self) {
    
    inline def setData(value: js.typedarray.DataView): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setStatus(value: USBTransferStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
