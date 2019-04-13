package typings
package tweetnaclLib.tweetnaclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignKeyPair extends js.Object {
  var publicKey: stdLib.Uint8Array
  var secretKey: stdLib.Uint8Array
}

object SignKeyPair {
  @scala.inline
  def apply(publicKey: stdLib.Uint8Array, secretKey: stdLib.Uint8Array): SignKeyPair = {
    val __obj = js.Dynamic.literal(publicKey = publicKey, secretKey = secretKey)
  
    __obj.asInstanceOf[SignKeyPair]
  }
}

