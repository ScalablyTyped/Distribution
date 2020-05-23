package typings.titanium.Titanium.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the service has been resolved (or errored). If successful, the [socket](Titanium.Network.BonjourService.socket) property should now be available.
  */
trait BonjourServiceResolveEvent extends BonjourServiceBaseEvent {
  /**
    * Error code
    */
  var code: Double
  /**
    * Error message
    */
  var error: String
  /**
    * Reports if the resolve operation was successful
    */
  var success: Boolean
}

object BonjourServiceResolveEvent {
  @scala.inline
  def apply(code: Double, error: String, source: BonjourService, success: Boolean): BonjourServiceResolveEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourServiceResolveEvent]
  }
}

