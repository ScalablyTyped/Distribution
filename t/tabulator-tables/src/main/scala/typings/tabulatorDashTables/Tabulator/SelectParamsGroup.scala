package typings.tabulatorDashTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectParamsGroup extends js.Object {
  var label: String
  var options: js.UndefOr[js.Array[SelectLabelValue]] = js.undefined
  var value: js.UndefOr[String | Double | Boolean] = js.undefined
}

object SelectParamsGroup {
  @scala.inline
  def apply(label: String, options: js.Array[SelectLabelValue] = null, value: String | Double | Boolean = null): SelectParamsGroup = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectParamsGroup]
  }
}

