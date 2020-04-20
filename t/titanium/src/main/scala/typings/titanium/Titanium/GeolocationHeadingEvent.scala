package typings.titanium.Titanium

import typings.titanium.HeadingData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Fired when an heading update is received.
	 */
trait GeolocationHeadingEvent extends GeolocationBaseEvent {
  /**
  		 * If `success` is `false`, the error code is available.
  		 */
  var code: Double
  /**
  		 * If `success` is false, a string describing the error.
  		 */
  var error: String
  /**
  		 * Dictionary object containing the heading data.
  		 */
  var heading: HeadingData
  /**
  		 * Indicate if the heading event was successfully received. Android returns this since SDK 7.5.0.
  		 */
  var success: Boolean
}

object GeolocationHeadingEvent {
  @scala.inline
  def apply(code: Double, error: String, heading: HeadingData, source: Geolocation, success: Boolean): GeolocationHeadingEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationHeadingEvent]
  }
}

