package typings.winrtUwp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnValueValue extends js.Object {
  /** Returns true if the method succeeds, or false otherwise. */ var returnValue: Boolean
  /** The current value of the setting. The units depend on the setting. */ var value: Double
}

object ReturnValueValue {
  @scala.inline
  def apply(returnValue: Boolean, value: Double): ReturnValueValue = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValueValue]
  }
}

