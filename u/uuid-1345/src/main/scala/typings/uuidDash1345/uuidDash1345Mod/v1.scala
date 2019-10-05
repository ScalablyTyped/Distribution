package typings.uuidDash1345.uuidDash1345Mod

import typings.node.Buffer
import typings.uuidDash1345.Anon_Ascii
import typings.uuidDash1345.Anon_Binary
import typings.uuidDash1345.Anon_Encoding
import typings.uuidDash1345.Anon_Mac
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuid-1345", "v1")
@js.native
object v1 extends js.Object {
  def apply(): String = js.native
  def apply(callback: ASCIICallback): Unit = js.native
  def apply(options: Anon_Ascii): String = js.native
  def apply(options: Anon_Ascii, callback: ASCIICallback): Unit = js.native
  def apply(options: Anon_Binary): Buffer = js.native
  def apply(options: Anon_Binary, callback: BinaryCallback): Unit = js.native
  def apply(options: Anon_Encoding): UUID = js.native
  def apply(options: Anon_Encoding, callback: ObjectCallback): Unit = js.native
  def apply(options: Anon_Mac): String = js.native
  def apply(options: Anon_Mac, callback: ASCIICallback): Unit = js.native
}

