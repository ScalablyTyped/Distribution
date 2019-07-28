package typings.textDashEncodingDashUtfDash8.textDashEncodingDashUtfDash8Mod.TextEncodingNs

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncoder extends js.Object {
  var encoding: String = js.native
  def encode(): Uint8Array = js.native
  def encode(input: String): Uint8Array = js.native
  def encode(input: String, options: TextEncodeOptions): Uint8Array = js.native
}

