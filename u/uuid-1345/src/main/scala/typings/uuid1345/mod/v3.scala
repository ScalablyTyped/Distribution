package typings.uuid1345.mod

import typings.node.Buffer
import typings.uuid1345.AnonEncodingName
import typings.uuid1345.AnonName
import typings.uuid1345.AnonNameNamespace
import typings.uuid1345.AnonNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuid-1345", "v3")
@js.native
object v3 extends js.Object {
  def apply(options: AnonEncodingName): Buffer = js.native
  def apply(options: AnonEncodingName, callback: BinaryCallback): Unit = js.native
  def apply(options: AnonName): String = js.native
  def apply(options: AnonNameNamespace): UUID = js.native
  def apply(options: AnonNameNamespace, callback: ObjectCallback): Unit = js.native
  def apply(options: AnonName, callback: ASCIICallback): Unit = js.native
  def apply(options: AnonNamespace): String = js.native
  def apply(options: AnonNamespace, callback: ASCIICallback): Unit = js.native
}

