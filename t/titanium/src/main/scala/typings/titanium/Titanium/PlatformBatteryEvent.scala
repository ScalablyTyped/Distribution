package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the battery state changes. This is measured in 5% increments on iPhone/iPad.
  */
@js.native
trait PlatformBatteryEvent extends PlatformBaseEvent {
  /**
    * Percentage battery power level.
    */
  var level: Double = js.native
  /**
    * The battery state.
    */
  var state: Double = js.native
}

object PlatformBatteryEvent {
  @scala.inline
  def apply(level: Double, source: Platform, state: Double): PlatformBatteryEvent = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformBatteryEvent]
  }
  @scala.inline
  implicit class PlatformBatteryEventOps[Self <: PlatformBatteryEvent] (val x: Self) extends AnyVal {
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
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: Double): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

