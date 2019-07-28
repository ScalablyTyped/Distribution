package typings.surveyDashKnockout.surveyDashKnockoutMod

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
    val __obj = js.Dynamic.literal(hasValue = hasValue, value = value)
  
    __obj.asInstanceOf[ValueCore]
  }
}

