package typings.tweetnacl.tweetnaclMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait scalarMult extends js.Object {
  val groupElementLength: Double = js.native
  val scalarLength: Double = js.native
  def apply(n: Uint8Array, p: Uint8Array): Uint8Array = js.native
  def base(n: Uint8Array): Uint8Array = js.native
}

