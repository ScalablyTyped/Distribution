package typings
package textDashEncodingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncoder extends js.Object {
  val encoding: java.lang.String = js.native
  def encode(): stdLib.Uint8Array = js.native
  def encode(input: java.lang.String): stdLib.Uint8Array = js.native
  def encode(input: java.lang.String, options: TextEncodeOptions): stdLib.Uint8Array = js.native
}

