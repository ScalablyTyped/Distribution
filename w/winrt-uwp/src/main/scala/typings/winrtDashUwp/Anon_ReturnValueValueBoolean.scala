package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReturnValueValueBoolean extends js.Object {
  /** Returns true if the method succeeded, or false otherwise. */ var returnValue: Boolean
  /** The power line frequency. */ var value: PowerlineFrequency
}

object Anon_ReturnValueValueBoolean {
  @scala.inline
  def apply(returnValue: Boolean, value: PowerlineFrequency): Anon_ReturnValueValueBoolean = {
    val __obj = js.Dynamic.literal(returnValue = returnValue, value = value)
  
    __obj.asInstanceOf[Anon_ReturnValueValueBoolean]
  }
}

