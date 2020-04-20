package typings.titanium.Titanium.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * For Javascript-based services that you create, `pause` fires after each time the JavaScript
		 * code executes.
		 */
trait QuickSettingsServicePauseEvent extends QuickSettingsServiceBaseEvent {
  /**
  			 * Incrementing integer indicating which iteration of an interval-based Service is pausing.
  			 * For example, if you have an interval-based Service running every 10 seconds, iteration
  			 * 3 would occur at about 30 seconds after you start the instance (assuming your service
  			 * code runs quickly).
  			 */
  var iteration: Double
}

object QuickSettingsServicePauseEvent {
  @scala.inline
  def apply(iteration: Double, source: QuickSettingsService): QuickSettingsServicePauseEvent = {
    val __obj = js.Dynamic.literal(iteration = iteration.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickSettingsServicePauseEvent]
  }
}

