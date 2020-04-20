package typings.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOther extends js.Object {
  var control: String
  var other: String
  var root: String
  var selectWrapper: String
}

object AnonOther {
  @scala.inline
  def apply(control: String, other: String, root: String, selectWrapper: String): AnonOther = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selectWrapper = selectWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOther]
  }
}

