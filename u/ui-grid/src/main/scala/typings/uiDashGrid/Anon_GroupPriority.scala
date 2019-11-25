package typings.uiDashGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupPriority extends js.Object {
  /**
    * number, starts at 0, if less than 0 or undefined then we're aggregating in this column
    */
  var groupPriority: Double
}

object Anon_GroupPriority {
  @scala.inline
  def apply(groupPriority: Double): Anon_GroupPriority = {
    val __obj = js.Dynamic.literal(groupPriority = groupPriority.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GroupPriority]
  }
}

