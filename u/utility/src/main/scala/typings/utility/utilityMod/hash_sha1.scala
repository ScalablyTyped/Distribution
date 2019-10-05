package typings.utility.utilityMod

import typings.node.Buffer
import typings.utility.utilityStrings.sha1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "hash")
@js.native
object hash_sha1 extends js.Object {
  def apply(method: sha1, s: String): String = js.native
  def apply(method: sha1, s: Buffer): String = js.native
}

