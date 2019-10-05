package typings.utility.utilityMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "md5")
@js.native
object md5 extends js.Object {
  /**
    * md5 hash
    *
    * @param {String|Buffer} s
    * @param {String} [format] output string format, could be 'hex' or 'base64'. default is 'hex'.
    * @return {String} md5 hash string
    * @public
    */
  def apply(s: String): String = js.native
  def apply(s: Buffer): String = js.native
}

