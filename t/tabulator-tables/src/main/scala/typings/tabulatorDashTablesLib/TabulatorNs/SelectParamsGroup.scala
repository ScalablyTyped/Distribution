package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectParamsGroup extends js.Object {
  var label: java.lang.String
  var options: js.UndefOr[js.Array[SelectLabelValue]] = js.undefined
  var value: js.UndefOr[java.lang.String | scala.Double | scala.Boolean] = js.undefined
}

object SelectParamsGroup {
  @scala.inline
  def apply(
    label: java.lang.String,
    options: js.Array[SelectLabelValue] = null,
    value: java.lang.String | scala.Double | scala.Boolean = null
  ): SelectParamsGroup = {
    val __obj = js.Dynamic.literal(label = label)
    if (options != null) __obj.updateDynamic("options")(options)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectParamsGroup]
  }
}

