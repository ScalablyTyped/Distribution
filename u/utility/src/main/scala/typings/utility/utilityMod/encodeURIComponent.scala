package typings.utility.utilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "encodeURIComponent")
@js.native
object encodeURIComponent extends js.Object {
  /**
    * Safe encodeURIComponent, won't throw any error.
    * If `encodeURIComponent` error happen, just return the original value.
    *
    * @param {String} text
    * @return {String} URL encode string.
    */
  def apply(text: String): String = js.native
}

