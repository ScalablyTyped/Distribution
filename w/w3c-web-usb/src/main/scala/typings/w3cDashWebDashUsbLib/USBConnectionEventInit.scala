package typings
package w3cDashWebDashUsbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBConnectionEventInit
  extends stdLib.EventInit {
  var device: USBDevice
}

object USBConnectionEventInit {
  @scala.inline
  def apply(
    device: USBDevice,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined
  ): USBConnectionEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("device")(device)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[USBConnectionEventInit]
  }
}

