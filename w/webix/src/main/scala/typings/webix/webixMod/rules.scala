package typings.webix.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait rules extends js.Object {
  def isChecked(): Boolean
  def isEmail(): Boolean
  def isNotEmpty(): Boolean
  def isNumber(): Boolean
}

object rules {
  @scala.inline
  def apply(
    isChecked: () => Boolean,
    isEmail: () => Boolean,
    isNotEmpty: () => Boolean,
    isNumber: () => Boolean
  ): rules = {
    val __obj = js.Dynamic.literal(isChecked = js.Any.fromFunction0(isChecked), isEmail = js.Any.fromFunction0(isEmail), isNotEmpty = js.Any.fromFunction0(isNotEmpty), isNumber = js.Any.fromFunction0(isNumber))
  
    __obj.asInstanceOf[rules]
  }
}

