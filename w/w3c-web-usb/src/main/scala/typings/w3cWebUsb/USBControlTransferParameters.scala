package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USBControlTransferParameters extends StObject {
  
  var index: Double = js.native
  
  var recipient: USBRecipient = js.native
  
  var request: Double = js.native
  
  var requestType: USBRequestType = js.native
  
  var value: Double = js.native
}
object USBControlTransferParameters {
  
  @scala.inline
  def apply(
    index: Double,
    recipient: USBRecipient,
    request: Double,
    requestType: USBRequestType,
    value: Double
  ): USBControlTransferParameters = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBControlTransferParameters]
  }
  
  @scala.inline
  implicit class USBControlTransferParametersMutableBuilder[Self <: USBControlTransferParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: USBRecipient): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: Double): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestType(value: USBRequestType): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
