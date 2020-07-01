package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cell extends js.Object {
  var cell: String
  var root: String
}

object Cell {
  @scala.inline
  def apply(cell: String, root: String): Cell = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
}

