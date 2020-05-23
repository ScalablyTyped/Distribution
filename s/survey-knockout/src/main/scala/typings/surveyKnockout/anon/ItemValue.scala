package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemValue extends js.Object {
  var itemTitle: String
  var itemValue: String
  var root: String
}

object ItemValue {
  @scala.inline
  def apply(itemTitle: String, itemValue: String, root: String): ItemValue = {
    val __obj = js.Dynamic.literal(itemTitle = itemTitle.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemValue]
  }
}

