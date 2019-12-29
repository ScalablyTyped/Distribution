package typings.xadesjs.xadesjsMod

import typings.std.BufferSource
import typings.std.Date
import typings.std.Uint8Array
import typings.xmlDashCore.xmlDashCoreMod.XmlBufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs", "Convert")
@js.native
class Convert ()
  extends typings.xmlDashCore.xmlDashCoreMod.Convert

/* static members */
@JSImport("xadesjs", "Convert")
@js.native
object Convert extends js.Object {
  /* protected */ def Base64Padding(base64: String): String = js.native
  def FromBase64(base64Text: String): Uint8Array = js.native
  def FromBase64Url(base64url: String): Uint8Array = js.native
  def FromBinary(text: String): Uint8Array = js.native
  /**
    * Converts Date to string
    *
    * @static
    * @param {Date} dateTime
    * @returns {string}
    *
    * @memberOf Convert
    */
  def FromDateTime(dateTime: Date): String = js.native
  /**
    * Converts HEX string to buffer
    *
    * @static
    * @param {string} hexString
    * @returns {Uint8Array}
    *
    * @memberOf Convert
    */
  def FromHex(hexString: String): Uint8Array = js.native
  def FromString(str: String): Uint8Array = js.native
  def FromString(str: String, enc: XmlBufferEncoding): Uint8Array = js.native
  def FromUtf8String(text: String): Uint8Array = js.native
  def ToBase64(buf: Uint8Array): String = js.native
  def ToBase64Url(data: Uint8Array): String = js.native
  def ToBinary(buffer: Uint8Array): String = js.native
  /**
    * Converts string to Date
    *
    * @static
    * @param {string} dateTime
    * @returns {Date}
    *
    * @memberOf Convert
    */
  def ToDateTime(dateTime: String): Date = js.native
  /**
    * Converts buffer to HEX string
    * @param  {BufferSource} buffer Incoming buffer
    * @returns string
    */
  def ToHex(buffer: Uint8Array): String = js.native
  def ToString(buffer: BufferSource): String = js.native
  def ToString(buffer: BufferSource, enc: XmlBufferEncoding): String = js.native
  def ToUtf8String(buffer: Uint8Array): String = js.native
}

