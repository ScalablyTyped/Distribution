package typings.webappsecCredentialManagement

import typings.std.ArrayBuffer
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.`public-key`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#publickeycredential}
  */
@js.native
trait PublicKeyCredential
  extends Credential
     with CredentialType {
  
  val rawId: ArrayBuffer = js.native
  
  val response: AuthenticatorResponse = js.native
  
  @JSName("type")
  val type_PublicKeyCredential: `public-key` = js.native
}
object PublicKeyCredential {
  
  @scala.inline
  def apply(id: String, rawId: ArrayBuffer, response: AuthenticatorResponse, `type`: `public-key`): PublicKeyCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rawId = rawId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredential]
  }
  
  @scala.inline
  implicit class PublicKeyCredentialOps[Self <: PublicKeyCredential] (val x: Self) extends AnyVal {
    
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
    def setRawId(value: ArrayBuffer): Self = this.set("rawId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: AuthenticatorResponse): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `public-key`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
