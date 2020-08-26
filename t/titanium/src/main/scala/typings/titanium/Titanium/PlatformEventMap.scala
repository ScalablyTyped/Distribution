package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformEventMap extends ProxyEventMap {
  var battery: PlatformBatteryEvent = js.native
}

object PlatformEventMap {
  @scala.inline
  def apply(battery: PlatformBatteryEvent): PlatformEventMap = {
    val __obj = js.Dynamic.literal(battery = battery.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformEventMap]
  }
  @scala.inline
  implicit class PlatformEventMapOps[Self <: PlatformEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBattery(value: PlatformBatteryEvent): Self = this.set("battery", value.asInstanceOf[js.Any])
  }
  
}

