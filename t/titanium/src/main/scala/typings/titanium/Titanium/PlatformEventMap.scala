package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformEventMap extends ProxyEventMap {
  var battery: PlatformBatteryEvent
}

object PlatformEventMap {
  @scala.inline
  def apply(battery: PlatformBatteryEvent): PlatformEventMap = {
    val __obj = js.Dynamic.literal(battery = battery.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformEventMap]
  }
}

