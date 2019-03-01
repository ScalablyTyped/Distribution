package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.groupingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGripGroup extends js.Object {
  var colName: java.lang.String
  var field: java.lang.String
  var groupPriority: scala.Double
}

object IGripGroup {
  @scala.inline
  def apply(colName: java.lang.String, field: java.lang.String, groupPriority: scala.Double): IGripGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colName")(colName)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("groupPriority")(groupPriority)
    __obj.asInstanceOf[IGripGroup]
  }
}

