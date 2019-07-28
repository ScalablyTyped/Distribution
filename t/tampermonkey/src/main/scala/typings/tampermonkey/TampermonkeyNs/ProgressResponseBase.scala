package typings.tampermonkey.TampermonkeyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressResponseBase extends js.Object {
  var done: Double
  var lengthComputable: Boolean
  var loaded: Double
  var position: Double
  var total: Double
  var totalSize: Double
}

object ProgressResponseBase {
  @scala.inline
  def apply(
    done: Double,
    lengthComputable: Boolean,
    loaded: Double,
    position: Double,
    total: Double,
    totalSize: Double
  ): ProgressResponseBase = {
    val __obj = js.Dynamic.literal(done = done, lengthComputable = lengthComputable, loaded = loaded, position = position, total = total, totalSize = totalSize)
  
    __obj.asInstanceOf[ProgressResponseBase]
  }
}

