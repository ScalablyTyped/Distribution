package typings.web3Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCipher extends js.Object {
  var cipher: String
  var cipherparams: AnonIv
  var ciphertext: String
  var kdf: String
  var kdfparams: AnonDklen
  var mac: String
}

object AnonCipher {
  @scala.inline
  def apply(
    cipher: String,
    cipherparams: AnonIv,
    ciphertext: String,
    kdf: String,
    kdfparams: AnonDklen,
    mac: String
  ): AnonCipher = {
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], cipherparams = cipherparams.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any], kdf = kdf.asInstanceOf[js.Any], kdfparams = kdfparams.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCipher]
  }
}

