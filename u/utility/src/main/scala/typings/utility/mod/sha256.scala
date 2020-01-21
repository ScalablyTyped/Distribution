package typings.utility.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "sha256")
@js.native
object sha256 extends js.Object {
  /**
    * sha256 hash
    *
    * @param {String|Buffer} s
    * @param {String} [format] output string format, could be 'hex' or 'base64'. default is 'hex'.
    * @return {String} sha256 hash string
    * @public
    */
  def apply(s: String): String = js.native
  def apply(s: Buffer): String = js.native
}

