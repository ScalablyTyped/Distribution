package typings.xmldsigjs.x509DataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IX509IssuerSerial extends js.Object {
  
  var issuerName: String = js.native
  
  var serialNumber: String = js.native
}
object IX509IssuerSerial {
  
  @scala.inline
  def apply(issuerName: String, serialNumber: String): IX509IssuerSerial = {
    val __obj = js.Dynamic.literal(issuerName = issuerName.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IX509IssuerSerial]
  }
  
  @scala.inline
  implicit class IX509IssuerSerialOps[Self <: IX509IssuerSerial] (val x: Self) extends AnyVal {
    
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
    def setIssuerName(value: String): Self = this.set("issuerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
  }
}
