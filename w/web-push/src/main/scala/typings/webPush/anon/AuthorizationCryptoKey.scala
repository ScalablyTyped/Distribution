package typings.webPush.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationCryptoKey extends js.Object {
  
  var Authorization: String = js.native
  
  var `Crypto-Key`: js.UndefOr[String] = js.native
}
object AuthorizationCryptoKey {
  
  @scala.inline
  def apply(Authorization: String): AuthorizationCryptoKey = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationCryptoKey]
  }
  
  @scala.inline
  implicit class AuthorizationCryptoKeyOps[Self <: AuthorizationCryptoKey] (val x: Self) extends AnyVal {
    
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
    def setAuthorization(value: String): Self = this.set("Authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCrypto-Key`(value: String): Self = this.set("Crypto-Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCrypto-Key`: Self = this.set("Crypto-Key", js.undefined)
  }
}
