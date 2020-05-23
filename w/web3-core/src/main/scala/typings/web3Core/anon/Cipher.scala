package typings.web3Core.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cipher extends js.Object {
  var cipher: String
  var cipherparams: Iv
  var ciphertext: String
  var kdf: String
  var kdfparams: Dklen
  var mac: String
}

object Cipher {
  @scala.inline
  def apply(cipher: String, cipherparams: Iv, ciphertext: String, kdf: String, kdfparams: Dklen, mac: String): Cipher = {
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], cipherparams = cipherparams.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any], kdf = kdf.asInstanceOf[js.Any], kdfparams = kdfparams.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cipher]
  }
}

