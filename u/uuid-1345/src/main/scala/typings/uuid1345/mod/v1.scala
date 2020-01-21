package typings.uuid1345.mod

import typings.node.Buffer
import typings.uuid1345.AnonAscii
import typings.uuid1345.AnonBinary
import typings.uuid1345.AnonEncoding
import typings.uuid1345.AnonMac
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuid-1345", "v1")
@js.native
object v1 extends js.Object {
  def apply(): String = js.native
  def apply(callback: ASCIICallback): Unit = js.native
  def apply(options: AnonAscii): String = js.native
  def apply(options: AnonAscii, callback: ASCIICallback): Unit = js.native
  def apply(options: AnonBinary): Buffer = js.native
  def apply(options: AnonBinary, callback: BinaryCallback): Unit = js.native
  def apply(options: AnonEncoding): UUID = js.native
  def apply(options: AnonEncoding, callback: ObjectCallback): Unit = js.native
  def apply(options: AnonMac): String = js.native
  def apply(options: AnonMac, callback: ASCIICallback): Unit = js.native
}

