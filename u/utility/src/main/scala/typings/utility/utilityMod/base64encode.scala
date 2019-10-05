package typings.utility.utilityMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "base64encode")
@js.native
object base64encode extends js.Object {
  /**
    * Base64 encode string.
    *
    * @param {String|Buffer} s
    * @param {Boolean} [urlsafe=false] Encode string s using a URL-safe alphabet,
    *   which substitutes - instead of + and _ instead of / in the standard Base64 alphabet.
    * @return {String} base64 encode format string.
    */
  def apply(s: String): String = js.native
  def apply(s: String, urlsafe: Boolean): String = js.native
  def apply(s: Buffer): String = js.native
  def apply(s: Buffer, urlsafe: Boolean): String = js.native
}

