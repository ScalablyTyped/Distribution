package typings.uuidDash1345.uuidDash1345Mod

import typings.node.Buffer
import typings.uuidDash1345.Anon_Ascii
import typings.uuidDash1345.Anon_AsciiEncoding
import typings.uuidDash1345.Anon_AsciiEncoding_847186865
import typings.uuidDash1345.Anon_Binary
import typings.uuidDash1345.Anon_BinaryEncoding
import typings.uuidDash1345.Anon_BinaryEncoding_852630054
import typings.uuidDash1345.Anon_Encoding
import typings.uuidDash1345.Anon_EncodingName
import typings.uuidDash1345.Anon_EncodingObject
import typings.uuidDash1345.Anon_Format
import typings.uuidDash1345.Anon_Mac
import typings.uuidDash1345.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuid-1345", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def check(uuid: String): Anon_Format = js.native
  def check(uuid: Buffer): Anon_Format = js.native
  def parse(uuid: String): Buffer = js.native
  def stringify(uuid: Buffer): String = js.native
  def v1(): String = js.native
  def v1(callback: ASCIICallback): Unit = js.native
  def v1(options: Anon_Ascii): String = js.native
  def v1(options: Anon_Ascii, callback: ASCIICallback): Unit = js.native
  def v1(options: Anon_Binary): Buffer = js.native
  def v1(options: Anon_Binary, callback: BinaryCallback): Unit = js.native
  def v1(options: Anon_Encoding): UUID = js.native
  def v1(options: Anon_Encoding, callback: ObjectCallback): Unit = js.native
  def v1(options: Anon_Mac): String = js.native
  def v1(options: Anon_Mac, callback: ASCIICallback): Unit = js.native
  def v3(options: Anon_AsciiEncoding): String = js.native
  def v3(options: Anon_AsciiEncoding, callback: ASCIICallback): Unit = js.native
  def v3(options: Anon_BinaryEncoding): Buffer = js.native
  def v3(options: Anon_BinaryEncoding, callback: BinaryCallback): Unit = js.native
  def v3(options: Anon_EncodingName): UUID = js.native
  def v3(options: Anon_EncodingName, callback: ObjectCallback): Unit = js.native
  def v3(options: Anon_Name): String = js.native
  def v3(options: Anon_Name, callback: ASCIICallback): Unit = js.native
  def v4(): String = js.native
  def v4(callback: ASCIICallback): Unit = js.native
  def v4(options: Anon_AsciiEncoding_847186865): String = js.native
  def v4(options: Anon_AsciiEncoding_847186865, callback: ASCIICallback): Unit = js.native
  def v4(options: Anon_BinaryEncoding_852630054): Buffer = js.native
  def v4(options: Anon_BinaryEncoding_852630054, callback: BinaryCallback): Unit = js.native
  def v4(options: Anon_EncodingObject): UUID = js.native
  def v4(options: Anon_EncodingObject, callback: ObjectCallback): Unit = js.native
  def v4fast(): String = js.native
  def v4fast(callback: ASCIICallback): Unit = js.native
  def v4fast(options: Anon_AsciiEncoding_847186865): String = js.native
  def v4fast(options: Anon_AsciiEncoding_847186865, callback: ASCIICallback): Unit = js.native
  def v4fast(options: Anon_BinaryEncoding_852630054): Buffer = js.native
  def v4fast(options: Anon_BinaryEncoding_852630054, callback: BinaryCallback): Unit = js.native
  def v4fast(options: Anon_EncodingObject): UUID = js.native
  def v4fast(options: Anon_EncodingObject, callback: ObjectCallback): Unit = js.native
  def v5(options: Anon_AsciiEncoding): String = js.native
  def v5(options: Anon_AsciiEncoding, callback: ASCIICallback): Unit = js.native
  def v5(options: Anon_BinaryEncoding): Buffer = js.native
  def v5(options: Anon_BinaryEncoding, callback: BinaryCallback): Unit = js.native
  def v5(options: Anon_EncodingName): UUID = js.native
  def v5(options: Anon_EncodingName, callback: ObjectCallback): Unit = js.native
  def v5(options: Anon_Name): String = js.native
  def v5(options: Anon_Name, callback: ASCIICallback): Unit = js.native
}

