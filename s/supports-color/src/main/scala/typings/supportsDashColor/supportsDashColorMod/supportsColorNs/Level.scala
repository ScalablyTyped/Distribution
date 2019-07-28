package typings.supportsDashColor.supportsDashColorMod.supportsColorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  var has16m: Boolean
  var has256: Boolean
  var hasBasic: Boolean
  var level: Double
}

object Level {
  @scala.inline
  def apply(has16m: Boolean, has256: Boolean, hasBasic: Boolean, level: Double): Level = {
    val __obj = js.Dynamic.literal(has16m = has16m, has256 = has256, hasBasic = hasBasic, level = level)
  
    __obj.asInstanceOf[Level]
  }
}

