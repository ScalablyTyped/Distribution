package typings.tweetnacl.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hash extends js.Object {
  val hashLength: Double = js.native
  def apply(msg: Uint8Array): Uint8Array = js.native
}

