package typings
package tampermonkeyLib.TampermonkeyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressResponseBase extends js.Object {
  var done: scala.Double
  var lengthComputable: scala.Boolean
  var loaded: scala.Double
  var position: scala.Double
  var total: scala.Double
  var totalSize: scala.Double
}

object ProgressResponseBase {
  @scala.inline
  def apply(
    done: scala.Double,
    lengthComputable: scala.Boolean,
    loaded: scala.Double,
    position: scala.Double,
    total: scala.Double,
    totalSize: scala.Double
  ): ProgressResponseBase = {
    val __obj = js.Dynamic.literal(done = done, lengthComputable = lengthComputable, loaded = loaded, position = position, total = total, totalSize = totalSize)
  
    __obj.asInstanceOf[ProgressResponseBase]
  }
}

