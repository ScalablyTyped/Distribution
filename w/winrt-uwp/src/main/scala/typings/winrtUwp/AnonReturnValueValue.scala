package typings.winrtUwp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReturnValueValue extends js.Object {
  /** Returns true if the method succeeds, or false otherwise. */ var returnValue: Boolean
  /** The current value of the setting. The units depend on the setting. */ var value: Double
}

object AnonReturnValueValue {
  @scala.inline
  def apply(returnValue: Boolean, value: Double): AnonReturnValueValue = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReturnValueValue]
  }
}

