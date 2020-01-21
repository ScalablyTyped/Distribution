package typings.utility.mod

import typings.node.Buffer
import typings.utility.utilityStrings.base64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "md5")
@js.native
object md5_base64 extends js.Object {
  def apply(s: String, format: base64): String = js.native
  def apply(s: Buffer, format: base64): String = js.native
}

