package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the proximity sensor changes state.
  */
@js.native
trait AppProximityEvent extends AppBaseEvent {
  /**
    * Proximity state value.
    */
  var state: Boolean = js.native
}

object AppProximityEvent {
  @scala.inline
  def apply(source: App, state: Boolean): AppProximityEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppProximityEvent]
  }
  @scala.inline
  implicit class AppProximityEventOps[Self <: AppProximityEvent] (val x: Self) extends AnyVal {
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
    def setState(value: Boolean): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

