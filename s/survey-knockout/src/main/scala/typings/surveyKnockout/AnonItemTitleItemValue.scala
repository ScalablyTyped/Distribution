package typings.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemTitleItemValue extends js.Object {
  var itemTitle: String
  var itemValue: String
  var root: String
}

object AnonItemTitleItemValue {
  @scala.inline
  def apply(itemTitle: String, itemValue: String, root: String): AnonItemTitleItemValue = {
    val __obj = js.Dynamic.literal(itemTitle = itemTitle.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemTitleItemValue]
  }
}

