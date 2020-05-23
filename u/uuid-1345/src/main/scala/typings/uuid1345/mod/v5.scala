package typings.uuid1345.mod

import typings.node.Buffer
import typings.uuid1345.anon.EncodingName
import typings.uuid1345.anon.Name
import typings.uuid1345.anon.NameNamespace
import typings.uuid1345.anon.Namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuid-1345", "v5")
@js.native
object v5 extends js.Object {
  def apply(options: EncodingName): Buffer = js.native
  def apply(options: EncodingName, callback: BinaryCallback): Unit = js.native
  def apply(options: Name): String = js.native
  def apply(options: NameNamespace): UUID = js.native
  def apply(options: NameNamespace, callback: ObjectCallback): Unit = js.native
  def apply(options: Name, callback: ASCIICallback): Unit = js.native
  def apply(options: Namespace): String = js.native
  def apply(options: Namespace, callback: ASCIICallback): Unit = js.native
}

