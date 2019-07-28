package typings.uiDashGrid.uiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectOption extends js.Object {
  var label: String
  var value: Double | String
}

object ISelectOption {
  @scala.inline
  def apply(label: String, value: Double | String): ISelectOption = {
    val __obj = js.Dynamic.literal(label = label, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISelectOption]
  }
}

