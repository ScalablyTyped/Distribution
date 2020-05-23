package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderCell extends js.Object {
  var cell: String
  var headerCell: String
  var root: String
}

object HeaderCell {
  @scala.inline
  def apply(cell: String, headerCell: String, root: String): HeaderCell = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], headerCell = headerCell.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderCell]
  }
}

