package typings
package surveyDashKnockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellLabel extends js.Object {
  var cellLabel: java.lang.String
  var cellText: java.lang.String
  var cellTextSelected: java.lang.String
  var label: java.lang.String
  var root: java.lang.String
}

object Anon_CellLabel {
  @scala.inline
  def apply(
    cellLabel: java.lang.String,
    cellText: java.lang.String,
    cellTextSelected: java.lang.String,
    label: java.lang.String,
    root: java.lang.String
  ): Anon_CellLabel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cellLabel")(cellLabel)
    __obj.updateDynamic("cellText")(cellText)
    __obj.updateDynamic("cellTextSelected")(cellTextSelected)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[Anon_CellLabel]
  }
}

