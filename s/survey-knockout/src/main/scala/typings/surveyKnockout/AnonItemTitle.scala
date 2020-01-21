package typings.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemTitle extends js.Object {
  var itemTitle: String
  var itemValue: String
  var root: String
  var row: String
}

object AnonItemTitle {
  @scala.inline
  def apply(itemTitle: String, itemValue: String, root: String, row: String): AnonItemTitle = {
    val __obj = js.Dynamic.literal(itemTitle = itemTitle.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemTitle]
  }
}

