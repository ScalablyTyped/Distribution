package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var field: java.lang.String
  var `type`: FilterType
  var value: js.Any
}

object Filter {
  @scala.inline
  def apply(field: java.lang.String, `type`: FilterType, value: js.Any): Filter = {
    val __obj = js.Dynamic.literal(field = field, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Filter]
  }
}

