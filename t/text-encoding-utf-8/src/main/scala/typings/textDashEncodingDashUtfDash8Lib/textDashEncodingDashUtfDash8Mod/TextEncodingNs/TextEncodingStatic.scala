package typings
package textDashEncodingDashUtfDash8Lib.textDashEncodingDashUtfDash8Mod.TextEncodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncodingStatic extends js.Object {
  @JSName("TextDecoder")
  var TextDecoder_Original: TextDecoderStatic = js.native
  @JSName("TextEncoder")
  var TextEncoder_Original: TextEncoderStatic = js.native
  def TextDecoder(): TextDecoder = js.native
  def TextDecoder(label: java.lang.String): TextDecoder = js.native
  def TextDecoder(label: java.lang.String, options: TextDecoderOptions): TextDecoder = js.native
  def TextEncoder(): TextEncoder = js.native
  def TextEncoder(utfLabel: java.lang.String): TextEncoder = js.native
  def TextEncoder(utfLabel: java.lang.String, options: TextEncoderOptions): TextEncoder = js.native
}

