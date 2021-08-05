package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBControlTransferParameters extends StObject {
  
  var index: Double
  
  var recipient: USBRecipient
  
  var request: Double
  
  var requestType: USBRequestType
  
  var value: Double
}
object USBControlTransferParameters {
  
  inline def apply(
    index: Double,
    recipient: USBRecipient,
    request: Double,
    requestType: USBRequestType,
    value: Double
  ): USBControlTransferParameters = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBControlTransferParameters]
  }
  
  extension [Self <: USBControlTransferParameters](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setRecipient(value: USBRecipient): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: Double): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestType(value: USBRequestType): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
