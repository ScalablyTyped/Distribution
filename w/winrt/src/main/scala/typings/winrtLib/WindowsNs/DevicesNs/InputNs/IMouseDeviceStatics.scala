package typings
package winrtLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseDeviceStatics extends js.Object {
  def getForCurrentView(): MouseDevice
}

object IMouseDeviceStatics {
  @scala.inline
  def apply(getForCurrentView: js.Function0[MouseDevice]): IMouseDeviceStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = getForCurrentView)
  
    __obj.asInstanceOf[IMouseDeviceStatics]
  }
}

