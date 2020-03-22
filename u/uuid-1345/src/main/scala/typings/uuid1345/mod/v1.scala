package typings.uuid1345.mod

import typings.node.Buffer
import typings.uuid1345.AnonEncoding
import typings.uuid1345.AnonEncodingMac
import typings.uuid1345.AnonMac
import typings.uuid1345.AnonMacBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuid-1345", "v1")
@js.native
object v1 extends js.Object {
  def apply(): String = js.native
  def apply(callback: ASCIICallback): Unit = js.native
  def apply(options: AnonEncoding): String = js.native
  def apply(options: AnonEncodingMac): Buffer = js.native
  def apply(options: AnonEncodingMac, callback: BinaryCallback): Unit = js.native
  def apply(options: AnonEncoding, callback: ASCIICallback): Unit = js.native
  def apply(options: AnonMac): String = js.native
  def apply(options: AnonMacBoolean): UUID = js.native
  def apply(options: AnonMacBoolean, callback: ObjectCallback): Unit = js.native
  def apply(options: AnonMac, callback: ASCIICallback): Unit = js.native
}

