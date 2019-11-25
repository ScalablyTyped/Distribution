package typings.winrtDashUwp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReturnValueValue extends js.Object {
  /** Returns true if the method succeeds, or false otherwise. */ var returnValue: Boolean
  /** The current value of the setting. The units depend on the setting. */ var value: Double
}

object Anon_ReturnValueValue {
  @scala.inline
  def apply(returnValue: Boolean, value: Double): Anon_ReturnValueValue = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ReturnValueValue]
  }
}

