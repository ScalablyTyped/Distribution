package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USBControlTransferParameters extends js.Object {
  
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
  implicit class USBControlTransferParametersOps[Self <: USBControlTransferParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: USBRecipient): Self = this.set("recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: Double): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestType(value: USBRequestType): Self = this.set("requestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
