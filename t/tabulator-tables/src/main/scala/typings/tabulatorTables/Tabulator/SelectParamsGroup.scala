package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectParamsGroup extends js.Object {
  var elementAttributes: js.UndefOr[js.Object] = js.undefined
  var label: String
  var options: js.UndefOr[js.Array[SelectLabelValue]] = js.undefined
  var value: js.UndefOr[String | Double | Boolean] = js.undefined
}

object SelectParamsGroup {
  @scala.inline
  def apply(
    label: String,
    elementAttributes: js.Object = null,
    options: js.Array[SelectLabelValue] = null,
    value: String | Double | Boolean = null
  ): SelectParamsGroup = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectParamsGroup]
  }
}

