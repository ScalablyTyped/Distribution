package typings
package tweetnaclLib.tweetnaclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxKeyPair extends js.Object {
  var publicKey: stdLib.Uint8Array
  var secretKey: stdLib.Uint8Array
}

object BoxKeyPair {
  @scala.inline
  def apply(publicKey: stdLib.Uint8Array, secretKey: stdLib.Uint8Array): BoxKeyPair = {
    val __obj = js.Dynamic.literal(publicKey = publicKey, secretKey = secretKey)
  
    __obj.asInstanceOf[BoxKeyPair]
  }
}

