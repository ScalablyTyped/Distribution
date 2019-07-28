package typings.xmlDashCore.xmlDashCoreMod

import typings.std.BufferSource
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", "Convert")
@js.native
class Convert () extends js.Object

/* static members */
@JSImport("xml-core", "Convert")
@js.native
object Convert extends js.Object {
  /* protected */ def Base64Padding(base64: String): String = js.native
  def FromBase64(base64Text: String): Uint8Array = js.native
  def FromBase64Url(base64url: String): Uint8Array = js.native
  def FromBinary(text: String): Uint8Array = js.native
  def FromDateTime(dateTime: Date): String = js.native
  def FromHex(hexString: String): Uint8Array = js.native
  def FromString(str: String): Uint8Array = js.native
  def FromString(str: String, enc: XmlBufferEncoding): Uint8Array = js.native
  def FromUtf8String(text: String): Uint8Array = js.native
  def ToBase64(buf: Uint8Array): String = js.native
  def ToBase64Url(data: Uint8Array): String = js.native
  def ToBinary(buffer: Uint8Array): String = js.native
  def ToDateTime(dateTime: String): Date = js.native
  def ToHex(buffer: Uint8Array): String = js.native
  def ToString(buffer: BufferSource): String = js.native
  def ToString(buffer: BufferSource, enc: XmlBufferEncoding): String = js.native
  def ToUtf8String(buffer: Uint8Array): String = js.native
}

