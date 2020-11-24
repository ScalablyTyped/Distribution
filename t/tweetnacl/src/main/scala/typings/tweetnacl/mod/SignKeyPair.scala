package typings.tweetnacl.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignKeyPair extends js.Object {
  
  var publicKey: Uint8Array = js.native
  
  var secretKey: Uint8Array = js.native
}
object SignKeyPair {
  
  @scala.inline
  def apply(publicKey: Uint8Array, secretKey: Uint8Array): SignKeyPair = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignKeyPair]
  }
  
  @scala.inline
  implicit class SignKeyPairOps[Self <: SignKeyPair] (val x: Self) extends AnyVal {
    
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
    def setPublicKey(value: Uint8Array): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKey(value: Uint8Array): Self = this.set("secretKey", value.asInstanceOf[js.Any])
  }
}
