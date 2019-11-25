package typings.uiDashGrid.uiDashGridMod.grouping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGripGroup extends js.Object {
  var colName: String
  var field: String
  var groupPriority: Double
}

object IGripGroup {
  @scala.inline
  def apply(colName: String, field: String, groupPriority: Double): IGripGroup = {
    val __obj = js.Dynamic.literal(colName = colName.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], groupPriority = groupPriority.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGripGroup]
  }
}

