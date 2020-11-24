package typings.web3Core.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cipher extends js.Object {
  
  var cipher: String = js.native
  
  var cipherparams: Iv = js.native
  
  var ciphertext: String = js.native
  
  var kdf: String = js.native
  
  var kdfparams: Dklen = js.native
  
  var mac: String = js.native
}
object Cipher {
  
  @scala.inline
  def apply(cipher: String, cipherparams: Iv, ciphertext: String, kdf: String, kdfparams: Dklen, mac: String): Cipher = {
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], cipherparams = cipherparams.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any], kdf = kdf.asInstanceOf[js.Any], kdfparams = kdfparams.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cipher]
  }
  
  @scala.inline
  implicit class CipherOps[Self <: Cipher] (val x: Self) extends AnyVal {
    
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
    def setCipher(value: String): Self = this.set("cipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherparams(value: Iv): Self = this.set("cipherparams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiphertext(value: String): Self = this.set("ciphertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKdf(value: String): Self = this.set("kdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKdfparams(value: Dklen): Self = this.set("kdfparams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMac(value: String): Self = this.set("mac", value.asInstanceOf[js.Any])
  }
}
