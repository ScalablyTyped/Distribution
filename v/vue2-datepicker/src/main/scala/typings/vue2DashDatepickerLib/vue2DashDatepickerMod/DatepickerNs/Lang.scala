package typings
package vue2DashDatepickerLib.vue2DashDatepickerMod.DatepickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lang extends js.Object {
  var days: js.Array[java.lang.String]
  var months: js.Array[java.lang.String]
  var pickers: js.Array[java.lang.String]
  var placeholder: vue2DashDatepickerLib.Anon_Date
}

object Lang {
  @scala.inline
  def apply(
    days: js.Array[java.lang.String],
    months: js.Array[java.lang.String],
    pickers: js.Array[java.lang.String],
    placeholder: vue2DashDatepickerLib.Anon_Date
  ): Lang = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("days")(days)
    __obj.updateDynamic("months")(months)
    __obj.updateDynamic("pickers")(pickers)
    __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[Lang]
  }
}

