package typings.uuid1345.mod

import typings.node.Buffer
import typings.uuid1345.AnonAsciiEncoding286985746
import typings.uuid1345.AnonBinaryEncoding252198624
import typings.uuid1345.AnonEncodingObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuid-1345", "v4")
@js.native
object v4 extends js.Object {
  def apply(): String = js.native
  def apply(callback: ASCIICallback): Unit = js.native
  def apply(options: AnonAsciiEncoding286985746): String = js.native
  def apply(options: AnonAsciiEncoding286985746, callback: ASCIICallback): Unit = js.native
  def apply(options: AnonBinaryEncoding252198624): Buffer = js.native
  def apply(options: AnonBinaryEncoding252198624, callback: BinaryCallback): Unit = js.native
  def apply(options: AnonEncodingObject): UUID = js.native
  def apply(options: AnonEncodingObject, callback: ObjectCallback): Unit = js.native
}

