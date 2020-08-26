package typings.titanium.Titanium.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the activity is already running and an intent different than the one that launched it was received.
  */
@js.native
trait ActivityNewintentEvent extends ActivityBaseEvent {
  /**
    * The `Intent` passed to the native `onNewIntent` method.
    */
  var intent: Intent = js.native
}

object ActivityNewintentEvent {
  @scala.inline
  def apply(intent: Intent, source: Activity): ActivityNewintentEvent = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityNewintentEvent]
  }
  @scala.inline
  implicit class ActivityNewintentEventOps[Self <: ActivityNewintentEvent] (val x: Self) extends AnyVal {
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

