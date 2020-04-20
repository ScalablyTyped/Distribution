package typings.uiGrid.mod.edit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditDropdown extends js.Object {
  var id: Double | String
  var value: js.Any
}

object IEditDropdown {
  @scala.inline
  def apply(id: Double | String, value: js.Any): IEditDropdown = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditDropdown]
  }
}

