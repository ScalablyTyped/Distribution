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
    isChecked: js.Function0[scala.Boolean],
    isEmail: js.Function0[scala.Boolean],
    isNotEmpty: js.Function0[scala.Boolean],
    isNumber: js.Function0[scala.Boolean]
  ): rules = {
    val __obj = js.Dynamic.literal(isChecked = isChecked, isEmail = isEmail, isNotEmpty = isNotEmpty, isNumber = isNumber)
  
    __obj.asInstanceOf[rules]
  }
}

