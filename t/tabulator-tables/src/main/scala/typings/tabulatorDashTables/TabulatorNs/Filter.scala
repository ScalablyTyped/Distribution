package typings.tabulatorDashTables.TabulatorNs

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
    val __obj = js.Dynamic.literal(field = field, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Filter]
  }
}

