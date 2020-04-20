package typings.titanium.Titanium.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the activity is launched.
		 */
trait ActivityOnIntentEvent extends ActivityBaseEvent {
  /**
  			 * The `Intent` used to launch the Activity.
  			 */
  var intent: Intent
}

object ActivityOnIntentEvent {
  @scala.inline
  def apply(intent: Intent, source: Activity): ActivityOnIntentEvent = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityOnIntentEvent]
  }
}

