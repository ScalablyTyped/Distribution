package typings
package tweetnaclLib.tweetnaclMod.naclNs.signNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait detached extends js.Object {
  def apply(msg: stdLib.Uint8Array, secretKey: stdLib.Uint8Array): stdLib.Uint8Array = js.native
  def verify(msg: stdLib.Uint8Array, sig: stdLib.Uint8Array, publicKey: stdLib.Uint8Array): scala.Boolean = js.native
}

