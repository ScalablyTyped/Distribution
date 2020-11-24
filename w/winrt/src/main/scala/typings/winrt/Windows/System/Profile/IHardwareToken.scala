package typings.winrt.Windows.System.Profile

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHardwareToken extends js.Object {
  
  var certificate: IBuffer = js.native
  
  var id: IBuffer = js.native
  
  var signature: IBuffer = js.native
}
object IHardwareToken {
  
  @scala.inline
  def apply(certificate: IBuffer, id: IBuffer, signature: IBuffer): IHardwareToken = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHardwareToken]
  }
  
  @scala.inline
  implicit class IHardwareTokenOps[Self <: IHardwareToken] (val x: Self) extends AnyVal {
    
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
    def setCertificate(value: IBuffer): Self = this.set("certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IBuffer): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: IBuffer): Self = this.set("signature", value.asInstanceOf[js.Any])
  }
}
