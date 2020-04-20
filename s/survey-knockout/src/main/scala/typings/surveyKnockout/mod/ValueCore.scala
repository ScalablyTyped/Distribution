package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueCore extends js.Object {
  var hasValue: Boolean
  var value: js.Any
}

object ValueCore {
  @scala.inline
  def apply(hasValue: Boolean, value: js.Any): ValueCore = {
    val __obj = js.Dynamic.literal(hasValue = hasValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueCore]
  }
}

