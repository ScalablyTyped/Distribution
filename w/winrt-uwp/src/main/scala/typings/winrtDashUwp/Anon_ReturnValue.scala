package typings.winrtDashUwp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReturnValue extends js.Object {
  /** Returns true if the method succeeds, or false otherwise. */ var returnValue: Boolean
  /** True if automatic adjustment is enabled; false otherwise. */ var value: Boolean
}

object Anon_ReturnValue {
  @scala.inline
  def apply(returnValue: Boolean, value: Boolean): Anon_ReturnValue = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ReturnValue]
  }
}

