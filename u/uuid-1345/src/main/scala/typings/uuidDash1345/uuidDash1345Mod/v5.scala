package typings.uuidDash1345.uuidDash1345Mod

import typings.node.Buffer
import typings.uuidDash1345.Anon_AsciiEncoding
import typings.uuidDash1345.Anon_BinaryEncoding
import typings.uuidDash1345.Anon_EncodingName
import typings.uuidDash1345.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuid-1345", "v5")
@js.native
object v5 extends js.Object {
  def apply(options: Anon_AsciiEncoding): String = js.native
  def apply(options: Anon_AsciiEncoding, callback: ASCIICallback): Unit = js.native
  def apply(options: Anon_BinaryEncoding): Buffer = js.native
  def apply(options: Anon_BinaryEncoding, callback: BinaryCallback): Unit = js.native
  def apply(options: Anon_EncodingName): UUID = js.native
  def apply(options: Anon_EncodingName, callback: ObjectCallback): Unit = js.native
  def apply(options: Anon_Name): String = js.native
  def apply(options: Anon_Name, callback: ASCIICallback): Unit = js.native
}

