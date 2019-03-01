package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReturnValueValueBoolean extends js.Object {
  /** Returns true if the method succeeded, or false otherwise. */ var returnValue: scala.Boolean
  /** The power line frequency. */ var value: winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency
}

object Anon_ReturnValueValueBoolean {
  @scala.inline
  def apply(returnValue: scala.Boolean, value: winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency): Anon_ReturnValueValueBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ReturnValueValueBoolean]
  }
}

