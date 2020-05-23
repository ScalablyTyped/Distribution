package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectWrapper extends js.Object {
  var control: String
  var onError: String
  var other: String
  var root: String
  var selectWrapper: String
  var small: String
}

object SelectWrapper {
  @scala.inline
  def apply(
    control: String,
    onError: String,
    other: String,
    root: String,
    selectWrapper: String,
    small: String
  ): SelectWrapper = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selectWrapper = selectWrapper.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectWrapper]
  }
}

