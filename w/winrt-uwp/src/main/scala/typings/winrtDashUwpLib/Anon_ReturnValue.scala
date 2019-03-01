package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReturnValue extends js.Object {
  /** Returns true if the method succeeds, or false otherwise. */ var returnValue: scala.Boolean
  /** True if automatic adjustment is enabled; false otherwise. */ var value: scala.Boolean
}

object Anon_ReturnValue {
  @scala.inline
  def apply(returnValue: scala.Boolean, value: scala.Boolean): Anon_ReturnValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ReturnValue]
  }
}

