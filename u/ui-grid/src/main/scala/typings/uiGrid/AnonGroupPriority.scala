package typings.uiGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupPriority extends js.Object {
  /**
    * number, starts at 0, if less than 0 or undefined then we're aggregating in this column
    */
  var groupPriority: Double
}

object AnonGroupPriority {
  @scala.inline
  def apply(groupPriority: Double): AnonGroupPriority = {
    val __obj = js.Dynamic.literal(groupPriority = groupPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroupPriority]
  }
}

