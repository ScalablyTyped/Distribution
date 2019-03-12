package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait rules extends js.Object {
  def isChecked(): scala.Boolean
  def isEmail(): scala.Boolean
  def isNotEmpty(): scala.Boolean
  def isNumber(): scala.Boolean
}

object rules {
  @scala.inline
  def apply(
    isChecked: () => scala.Boolean,
    isEmail: () => scala.Boolean,
    isNotEmpty: () => scala.Boolean,
    isNumber: () => scala.Boolean
  ): rules = {
    val __obj = js.Dynamic.literal(isChecked = js.Any.fromFunction0(isChecked), isEmail = js.Any.fromFunction0(isEmail), isNotEmpty = js.Any.fromFunction0(isNotEmpty), isNumber = js.Any.fromFunction0(isNumber))
  
    __obj.asInstanceOf[rules]
  }
}

