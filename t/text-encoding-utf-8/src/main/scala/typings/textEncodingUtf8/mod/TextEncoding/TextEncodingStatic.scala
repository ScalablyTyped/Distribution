package typings.textEncodingUtf8.mod.TextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncodingStatic extends js.Object {
  @JSName("TextDecoder")
  var TextDecoder_Original: TextDecoderStatic = js.native
  @JSName("TextEncoder")
  var TextEncoder_Original: TextEncoderStatic = js.native
  def TextDecoder(): typings.textEncodingUtf8.mod.TextEncoding.TextDecoder = js.native
  def TextDecoder(label: js.UndefOr[scala.Nothing], options: TextDecoderOptions): typings.textEncodingUtf8.mod.TextEncoding.TextDecoder = js.native
  def TextDecoder(label: String): typings.textEncodingUtf8.mod.TextEncoding.TextDecoder = js.native
  def TextDecoder(label: String, options: TextDecoderOptions): typings.textEncodingUtf8.mod.TextEncoding.TextDecoder = js.native
  def TextEncoder(): typings.textEncodingUtf8.mod.TextEncoding.TextEncoder = js.native
  def TextEncoder(utfLabel: js.UndefOr[scala.Nothing], options: TextEncoderOptions): typings.textEncodingUtf8.mod.TextEncoding.TextEncoder = js.native
  def TextEncoder(utfLabel: String): typings.textEncodingUtf8.mod.TextEncoding.TextEncoder = js.native
  def TextEncoder(utfLabel: String, options: TextEncoderOptions): typings.textEncodingUtf8.mod.TextEncoding.TextEncoder = js.native
}

