package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cipher extends js.Object {
  var cipher: java.lang.String
  var cipherparams: Anon_Iv
  var ciphertext: java.lang.String
  var kdf: java.lang.String
  var kdfparams: Anon_Dklen
  var mac: java.lang.String
}

object Anon_Cipher {
  @scala.inline
  def apply(
    cipher: java.lang.String,
    cipherparams: Anon_Iv,
    ciphertext: java.lang.String,
    kdf: java.lang.String,
    kdfparams: Anon_Dklen,
    mac: java.lang.String
  ): Anon_Cipher = {
    val __obj = js.Dynamic.literal(cipher = cipher, cipherparams = cipherparams, ciphertext = ciphertext, kdf = kdf, kdfparams = kdfparams, mac = mac)
  
    __obj.asInstanceOf[Anon_Cipher]
  }
}

