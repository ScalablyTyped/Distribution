package typings.titanium.Titanium.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the activity is launched.
  */
@js.native
trait ActivityOnIntentEvent extends ActivityBaseEvent {
  /**
    * The `Intent` used to launch the Activity.
    */
  var intent: Intent = js.native
}

object ActivityOnIntentEvent {
  @scala.inline
  def apply(intent: Intent, source: Activity): ActivityOnIntentEvent = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityOnIntentEvent]
  }
  @scala.inline
  implicit class ActivityOnIntentEventOps[Self <: ActivityOnIntentEvent] (val x: Self) extends AnyVal {
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
    def setIntent(value: Intent): Self = this.set("intent", value.asInstanceOf[js.Any])
  }
  
}

