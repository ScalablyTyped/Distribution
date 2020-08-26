package typings.textEncodingUtf8.mod

import org.scalablytyped.runtime.TopLevel
import typings.textEncodingUtf8.mod.TextEncoding.TextEncoderOptions
import typings.textEncodingUtf8.mod.TextEncoding.TextEncoderStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("text-encoding-utf-8", "TextEncoder")
@js.native
class TextEncoder ()
  extends typings.textEncodingUtf8.mod.TextEncoding.TextEncoder {
  def this(utfLabel: String) = this()
  def this(utfLabel: js.UndefOr[scala.Nothing], options: TextEncoderOptions) = this()
  def this(utfLabel: String, options: TextEncoderOptions) = this()
}

@JSImport("text-encoding-utf-8", "TextEncoder")
@js.native
object TextEncoder extends TopLevel[TextEncoderStatic]

