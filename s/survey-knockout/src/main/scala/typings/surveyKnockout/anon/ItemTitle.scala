package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemTitle extends js.Object {
  var itemTitle: String
  var itemValue: String
  var root: String
  var row: String
}

object ItemTitle {
  @scala.inline
  def apply(itemTitle: String, itemValue: String, root: String, row: String): ItemTitle = {
    val __obj = js.Dynamic.literal(itemTitle = itemTitle.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemTitle]
  }
}

