package typings.winrtUwp.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains data that can be retrieved from encrypted and authenticated data. Authenticated encryption algorithms are opened by using the SymmetricKeyAlgorithmProvider class. */
@js.native
trait EncryptedAndAuthenticatedData extends js.Object {
  
  /** Gets the authentication tag. */
  var authenticationTag: IBuffer = js.native
  
  /** Gets the encrypted data. */
  var encryptedData: IBuffer = js.native
}
object EncryptedAndAuthenticatedData {
  
  @scala.inline
  def apply(authenticationTag: IBuffer, encryptedData: IBuffer): EncryptedAndAuthenticatedData = {
    val __obj = js.Dynamic.literal(authenticationTag = authenticationTag.asInstanceOf[js.Any], encryptedData = encryptedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedAndAuthenticatedData]
  }
  
  @scala.inline
  implicit class EncryptedAndAuthenticatedDataOps[Self <: EncryptedAndAuthenticatedData] (val x: Self) extends AnyVal {
    
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
    def setAuthenticationTag(value: IBuffer): Self = this.set("authenticationTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedData(value: IBuffer): Self = this.set("encryptedData", value.asInstanceOf[js.Any])
  }
}
