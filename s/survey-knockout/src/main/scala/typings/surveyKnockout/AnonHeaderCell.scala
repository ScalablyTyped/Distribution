package typings.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaderCell extends js.Object {
  var cell: String
  var headerCell: String
  var root: String
}

object AnonHeaderCell {
  @scala.inline
  def apply(cell: String, headerCell: String, root: String): AnonHeaderCell = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], headerCell = headerCell.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeaderCell]
  }
}

