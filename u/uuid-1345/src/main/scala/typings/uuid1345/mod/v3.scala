package typings.uuid1345.mod

import typings.node.Buffer
import typings.uuid1345.AnonAsciiEncoding
import typings.uuid1345.AnonBinaryEncoding
import typings.uuid1345.AnonEncodingName
import typings.uuid1345.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuid-1345", "v3")
@js.native
object v3 extends js.Object {
  def apply(options: AnonAsciiEncoding): String = js.native
  def apply(options: AnonAsciiEncoding, callback: ASCIICallback): Unit = js.native
  def apply(options: AnonBinaryEncoding): Buffer = js.native
  def apply(options: AnonBinaryEncoding, callback: BinaryCallback): Unit = js.native
  def apply(options: AnonEncodingName): UUID = js.native
  def apply(options: AnonEncodingName, callback: ObjectCallback): Unit = js.native
  def apply(options: AnonName): String = js.native
  def apply(options: AnonName, callback: ASCIICallback): Unit = js.native
}

