package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupPriority extends js.Object {
  /**
    * number, starts at 0, if less than 0 or undefined then we're aggregating in this column
    */
  var groupPriority: scala.Double
}

object Anon_GroupPriority {
  @scala.inline
  def apply(groupPriority: scala.Double): Anon_GroupPriority = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("groupPriority")(groupPriority)
    __obj.asInstanceOf[Anon_GroupPriority]
  }
}

