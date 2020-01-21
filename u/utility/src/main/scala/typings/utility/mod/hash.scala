package typings.utility.mod

import typings.node.Buffer
import typings.utility.utilityStrings.base64
import typings.utility.utilityStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "hash")
@js.native
object hash extends js.Object {
  def apply(method: typings.utility.utilityStrings.md5, s: String, format: base64): String = js.native
  def apply(method: typings.utility.utilityStrings.md5, s: String, format: hex): String = js.native
  def apply(method: typings.utility.utilityStrings.md5, s: Buffer, format: base64): String = js.native
  def apply(method: typings.utility.utilityStrings.md5, s: Buffer, format: hex): String = js.native
  def apply(method: typings.utility.utilityStrings.sha1, s: String, format: base64): String = js.native
  def apply(method: typings.utility.utilityStrings.sha1, s: String, format: hex): String = js.native
  def apply(method: typings.utility.utilityStrings.sha1, s: Buffer, format: base64): String = js.native
  def apply(method: typings.utility.utilityStrings.sha1, s: Buffer, format: hex): String = js.native
}

