package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.editNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditDropdown extends js.Object {
  var id: scala.Double | java.lang.String
  var value: js.Any
}

object IEditDropdown {
  @scala.inline
  def apply(id: scala.Double | java.lang.String, value: js.Any): IEditDropdown = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IEditDropdown]
  }
}

