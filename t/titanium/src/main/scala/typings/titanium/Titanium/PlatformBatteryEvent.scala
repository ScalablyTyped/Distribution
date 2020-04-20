package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Fired when the battery state changes. This is measured in 5% increments on iPhone/iPad.
	 */
trait PlatformBatteryEvent extends PlatformBaseEvent {
  /**
  		 * Percentage battery power level.
  		 */
  var level: Double
  /**
  		 * The battery state.
  		 */
  var state: Double
}

object PlatformBatteryEvent {
  @scala.inline
  def apply(level: Double, source: Platform, state: Double): PlatformBatteryEvent = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformBatteryEvent]
  }
}

