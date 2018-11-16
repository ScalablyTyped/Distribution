package typings
package textDashEncodingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDecoder extends js.Object {
  val encoding: java.lang.String = js.native
  def decode(): java.lang.String = js.native
  def decode(input: stdLib.Uint8Array): java.lang.String = js.native
  def decode(input: stdLib.Uint8Array, options: TextDecoderOptions): java.lang.String = js.native
}

