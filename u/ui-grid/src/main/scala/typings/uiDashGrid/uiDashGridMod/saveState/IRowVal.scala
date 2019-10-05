package typings.uiDashGrid.uiDashGridMod.saveState

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowVal extends js.Object {
  var identity: Boolean
  var row: Double | js.Any
}

object IRowVal {
  @scala.inline
  def apply(identity: Boolean, row: Double | js.Any): IRowVal = {
    val __obj = js.Dynamic.literal(identity = identity, row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRowVal]
  }
}

