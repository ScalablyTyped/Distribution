package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiEncrypt")
@js.native
object nlapiEncrypt extends js.Object {
  /**
    * Encrypt a String using a SHA-1 hash function
    *
    * @param {string} s string to encrypt
    * @return {string}
    *
    * @since 2009.2
    * @param s
    * @return
    */
  def apply(s: String, algotithm: String): String = js.native
  def apply(s: String, algotithm: String, key: String): String = js.native
}

