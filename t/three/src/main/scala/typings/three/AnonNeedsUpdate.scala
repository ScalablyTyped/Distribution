package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNeedsUpdate extends js.Object {
  var needsUpdate: Boolean
  var value: js.Any
}

object AnonNeedsUpdate {
  @scala.inline
  def apply(needsUpdate: Boolean, value: js.Any): AnonNeedsUpdate = {
    val __obj = js.Dynamic.literal(needsUpdate = needsUpdate.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNeedsUpdate]
  }
}

