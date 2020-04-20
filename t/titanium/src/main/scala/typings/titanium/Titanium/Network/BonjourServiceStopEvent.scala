package typings.titanium.Titanium.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when a service's publish or resolution was stopped via <Titanium.Network.BonjourService.stop>
		 */
trait BonjourServiceStopEvent extends BonjourServiceBaseEvent {
  /**
  			 * Error code
  			 */
  var code: Double
  /**
  			 * Error message
  			 */
  var error: String
  /**
  			 * Reports if the stop operation was successful
  			 */
  var success: Boolean
}

object BonjourServiceStopEvent {
  @scala.inline
  def apply(code: Double, error: String, source: BonjourService, success: Boolean): BonjourServiceStopEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourServiceStopEvent]
  }
}

