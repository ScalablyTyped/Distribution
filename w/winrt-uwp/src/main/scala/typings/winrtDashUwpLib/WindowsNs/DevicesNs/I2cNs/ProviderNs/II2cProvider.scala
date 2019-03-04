package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.I2cNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents actions common to all I²C providers. */
trait II2cProvider extends js.Object {
  var getControllersAsync: js.Any
}

object II2cProvider {
  @scala.inline
  def apply(getControllersAsync: js.Any): II2cProvider = {
    val __obj = js.Dynamic.literal(getControllersAsync = getControllersAsync)
  
    __obj.asInstanceOf[II2cProvider]
  }
}

