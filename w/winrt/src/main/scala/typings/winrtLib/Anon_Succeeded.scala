package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Succeeded extends js.Object {
  var succeeded: scala.Boolean
  var value: winrtLib.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency
}

object Anon_Succeeded {
  @scala.inline
  def apply(succeeded: scala.Boolean, value: winrtLib.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency): Anon_Succeeded = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("succeeded")(succeeded)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Succeeded]
  }
}

