package typings.web3DashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cipher extends js.Object {
  var cipher: String
  var cipherparams: Anon_Iv
  var ciphertext: String
  var kdf: String
  var kdfparams: Anon_Dklen
  var mac: String
}

object Anon_Cipher {
  @scala.inline
  def apply(
    cipher: String,
    cipherparams: Anon_Iv,
    ciphertext: String,
    kdf: String,
    kdfparams: Anon_Dklen,
    mac: String
  ): Anon_Cipher = {
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], cipherparams = cipherparams.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any], kdf = kdf.asInstanceOf[js.Any], kdfparams = kdfparams.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cipher]
  }
}

