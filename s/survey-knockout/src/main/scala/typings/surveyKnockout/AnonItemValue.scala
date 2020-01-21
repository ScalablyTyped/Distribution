package typings.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemValue extends js.Object {
  var itemValue: String
  var root: String
}

object AnonItemValue {
  @scala.inline
  def apply(itemValue: String, root: String): AnonItemValue = {
    val __obj = js.Dynamic.literal(itemValue = itemValue.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemValue]
  }
}

