package typings
package xmlDashCoreLib.xmlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", "Convert")
@js.native
class Convert ()
  extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.Convert

@JSImport("xml-core", "Convert")
@js.native
object Convert extends js.Object {
  /* protected */ def Base64Padding(base64: java.lang.String): java.lang.String = js.native
  def FromBase64(base64Text: java.lang.String): stdLib.Uint8Array = js.native
  def FromBase64Url(base64url: java.lang.String): stdLib.Uint8Array = js.native
  def FromBinary(text: java.lang.String): stdLib.Uint8Array = js.native
  def FromDateTime(dateTime: stdLib.Date): java.lang.String = js.native
  def FromHex(hexString: java.lang.String): stdLib.Uint8Array = js.native
  def FromString(str: java.lang.String): stdLib.Uint8Array = js.native
  def FromString(str: java.lang.String, enc: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlBufferEncoding): stdLib.Uint8Array = js.native
  def FromUtf8String(text: java.lang.String): stdLib.Uint8Array = js.native
  def ToBase64(buf: stdLib.Uint8Array): java.lang.String = js.native
  def ToBase64Url(data: stdLib.Uint8Array): java.lang.String = js.native
  def ToBinary(buffer: stdLib.Uint8Array): java.lang.String = js.native
  def ToDateTime(dateTime: java.lang.String): stdLib.Date = js.native
  def ToHex(buffer: stdLib.Uint8Array): java.lang.String = js.native
  def ToString(buffer: stdLib.BufferSource): java.lang.String = js.native
  def ToString(buffer: stdLib.BufferSource, enc: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlBufferEncoding): java.lang.String = js.native
  def ToUtf8String(buffer: stdLib.Uint8Array): java.lang.String = js.native
}

