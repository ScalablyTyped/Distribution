package typings.winrtUwp

import typings.winrtUwp.Windows.Media.Capture.PowerlineFrequency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReturnValueValueBoolean extends js.Object {
  /** Returns true if the method succeeded, or false otherwise. */ var returnValue: Boolean
  /** The power line frequency. */ var value: PowerlineFrequency
}

object AnonReturnValueValueBoolean {
  @scala.inline
  def apply(returnValue: Boolean, value: PowerlineFrequency): AnonReturnValueValueBoolean = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReturnValueValueBoolean]
  }
}

