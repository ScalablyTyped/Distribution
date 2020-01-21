package typings.textEncodingUtf8.mod.TextEncoding

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDecoder extends js.Object {
  var encoding: String = js.native
  var fatal: Boolean = js.native
  var ignoreBOM: Boolean = js.native
  def decode(): String = js.native
  def decode(input: ArrayBuffer): String = js.native
  def decode(input: ArrayBufferView): String = js.native
  def decode(input: ArrayBufferView, options: TextDecodeOptions): String = js.native
  def decode(input: ArrayBuffer, options: TextDecodeOptions): String = js.native
}

