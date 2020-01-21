package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var field: String
  var `type`: FilterType
  var value: js.Any
}

object Filter {
  @scala.inline
  def apply(field: String, `type`: FilterType, value: js.Any): Filter = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

