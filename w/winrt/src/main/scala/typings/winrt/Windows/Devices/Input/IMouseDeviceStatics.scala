package typings.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseDeviceStatics extends js.Object {
  def getForCurrentView(): MouseDevice
}

object IMouseDeviceStatics {
  @scala.inline
  def apply(getForCurrentView: () => MouseDevice): IMouseDeviceStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView))
  
    __obj.asInstanceOf[IMouseDeviceStatics]
  }
}

