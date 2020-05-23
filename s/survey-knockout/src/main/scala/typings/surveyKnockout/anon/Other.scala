package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Other extends js.Object {
  var control: String
  var other: String
  var root: String
  var selectWrapper: String
}

object Other {
  @scala.inline
  def apply(control: String, other: String, root: String, selectWrapper: String): Other = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selectWrapper = selectWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Other]
  }
}

