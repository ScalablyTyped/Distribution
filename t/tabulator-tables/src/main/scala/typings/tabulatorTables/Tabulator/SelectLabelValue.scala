package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectLabelValue extends js.Object {
  var label: String
  var value: String | Double | Boolean
}

object SelectLabelValue {
  @scala.inline
  def apply(label: String, value: String | Double | Boolean): SelectLabelValue = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectLabelValue]
  }
}

