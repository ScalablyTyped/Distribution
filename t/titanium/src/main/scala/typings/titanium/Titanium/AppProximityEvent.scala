package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the proximity sensor changes state.
  */
trait AppProximityEvent extends AppBaseEvent {
  /**
    * Proximity state value.
    */
  var state: Boolean
}

object AppProximityEvent {
  @scala.inline
  def apply(source: App, state: Boolean): AppProximityEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppProximityEvent]
  }
}

