package typings
package tweetnaclLib.tweetnaclMod.naclNs.boxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait open extends js.Object {
  def apply(
    msg: stdLib.Uint8Array,
    nonce: stdLib.Uint8Array,
    publicKey: stdLib.Uint8Array,
    secretKey: stdLib.Uint8Array
  ): stdLib.Uint8Array | tweetnaclLib.tweetnaclLibNumbers.`false` = js.native
  def after(box: stdLib.Uint8Array, nonce: stdLib.Uint8Array, key: stdLib.Uint8Array): stdLib.Uint8Array | tweetnaclLib.tweetnaclLibNumbers.`false` = js.native
}

