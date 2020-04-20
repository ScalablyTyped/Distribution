package typings.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemValue extends js.Object {
  var itemTitle: String
  var itemValue: String
  var root: String
}

object AnonItemValue {
  @scala.inline
  def apply(itemTitle: String, itemValue: String, root: String): AnonItemValue = {
    val __obj = js.Dynamic.literal(itemTitle = itemTitle.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemValue]
  }
}

