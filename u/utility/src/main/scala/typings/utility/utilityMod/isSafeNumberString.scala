package typings.utility.utilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "isSafeNumberString")
@js.native
object isSafeNumberString extends js.Object {
  /**
    * Detect a number string can safe convert to Javascript Number.
    *
    * @param {String} s number format string, like `"123"`, `"-1000123123123123123123"`
    * @return {Boolean}
    */
  def apply(s: String): Boolean = js.native
}

