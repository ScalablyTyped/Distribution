package typings.titanium.Titanium.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the service has been published (or errored).
		 */
trait BonjourServicePublishEvent extends BonjourServiceBaseEvent {
  /**
  			 * Error code
  			 */
  var code: Double
  /**
  			 * Error message
  			 */
  var error: String
  /**
  			 * Reports if the publish operation was successful
  			 */
  var success: Boolean
}

object BonjourServicePublishEvent {
  @scala.inline
  def apply(code: Double, error: String, source: BonjourService, success: Boolean): BonjourServicePublishEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourServicePublishEvent]
  }
}

