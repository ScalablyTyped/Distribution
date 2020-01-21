package typings.utility.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "base64decode")
@js.native
object base64decode extends js.Object {
  /**
    * Base64 string decode.
    *
    * @param {String} encode, base64 encoding string.
    * @param {Boolean} [urlsafe=false] Decode string s using a URL-safe alphabet,
    *   which substitutes - instead of + and _ instead of / in the standard Base64 alphabet.
    * @param {encoding} [encoding=utf8] if encoding = buffer, will return Buffer instance
    * @return {String|Buffer} plain text.
    */
  def apply(encode: String): String | Buffer = js.native
  def apply(encode: String, urlsafe: Boolean): String | Buffer = js.native
}

