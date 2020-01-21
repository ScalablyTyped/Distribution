package typings.utility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "decodeURIComponent")
@js.native
object decodeURIComponent extends js.Object {
  /**
    * Safe decodeURIComponent, won't throw any error.
    * If `decodeURIComponent` error happen, just return the original value.
    *
    * @param {String} encodeText
    * @return {String} URL decode original string.
    */
  def apply(encodeText: String): String = js.native
}

