package typings.surveyDashKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cell extends js.Object {
  var cell: String
  var item: String
  var itemTitle: String
  var root: String
  var row: String
}

object Anon_Cell {
  @scala.inline
  def apply(cell: String, item: String, itemTitle: String, root: String, row: String): Anon_Cell = {
    val __obj = js.Dynamic.literal(cell = cell, item = item, itemTitle = itemTitle, root = root, row = row)
  
    __obj.asInstanceOf[Anon_Cell]
  }
}

