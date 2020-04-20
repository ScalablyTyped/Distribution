package typings.titanium.Titanium.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the activity is already running and an intent different than the one that launched it was received.
		 */
trait ActivityNewintentEvent extends ActivityBaseEvent {
  /**
  			 * The `Intent` passed to the native `onNewIntent` method.
  			 */
  var intent: Intent
}

object ActivityNewintentEvent {
  @scala.inline
  def apply(intent: Intent, source: Activity): ActivityNewintentEvent = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityNewintentEvent]
  }
}

