package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents actions common to general-purpose I/O (GPIO) controller providers. */
trait IGpioProvider extends js.Object {
  var getControllers: js.Any
}

object IGpioProvider {
  @scala.inline
  def apply(getControllers: js.Any): IGpioProvider = {
    val __obj = js.Dynamic.literal(getControllers = getControllers)
  
    __obj.asInstanceOf[IGpioProvider]
  }
}

