package typings.w3cDashWebDashUsb

import typings.std.EventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBConnectionEventInit extends EventInit {
  var device: USBDevice
}

object USBConnectionEventInit {
  @scala.inline
  def apply(
    device: USBDevice,
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    composed: js.UndefOr[Boolean] = js.undefined
  ): USBConnectionEventInit = {
    val __obj = js.Dynamic.literal(device = device)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[USBConnectionEventInit]
  }
}

