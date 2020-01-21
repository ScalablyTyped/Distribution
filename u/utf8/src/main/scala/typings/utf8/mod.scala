package typings.utf8

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utf8", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * A string representing the semantic version number.
    */
  var version: String = js.native
  /**
    * Decodes any given UTF-8-encoded string (byteString) as UTF-8, and returns the UTF-8-decoded version of the string.
    * It throws an error when malformed UTF-8 is detected.
    * @param {string} byteString
    */
  def decode(byteString: String): String = js.native
  /**
    * Encodes any given JavaScript string (string) as UTF-8, and returns the UTF-8-encoded version of the string.
    * It throws an error if the input string contains a non-scalar value, i.e. a lone surrogate.
    * @param {string} inputString
    */
  def encode(inputString: String): String = js.native
}

