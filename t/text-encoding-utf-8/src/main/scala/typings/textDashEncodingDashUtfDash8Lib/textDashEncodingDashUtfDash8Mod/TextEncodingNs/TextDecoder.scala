package typings
package textDashEncodingDashUtfDash8Lib.textDashEncodingDashUtfDash8Mod.TextEncodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDecoder extends js.Object {
  var encoding: java.lang.String = js.native
  var fatal: scala.Boolean = js.native
  var ignoreBOM: scala.Boolean = js.native
  def decode(): java.lang.String = js.native
  def decode(input: stdLib.ArrayBuffer): java.lang.String = js.native
  def decode(input: stdLib.ArrayBufferView): java.lang.String = js.native
  def decode(input: stdLib.ArrayBufferView, options: TextDecodeOptions): java.lang.String = js.native
  def decode(input: stdLib.ArrayBuffer, options: TextDecodeOptions): java.lang.String = js.native
}

