package typings.titanium

import typings.titanium.Titanium.Android.Activity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object passed to the <Titanium.Android.Activity> callbacks for
  * onCreate, onDestroy, onPause, onResume, onStart, onStop, onRestart.
  * Additional properties may be set on the Object.
  */
trait ActivityLifecycleCallbackObject extends js.Object {
  /**
  	 * The Activity firing the callback.
  	 */
  var source: js.UndefOr[Activity] = js.undefined
}

object ActivityLifecycleCallbackObject {
  @scala.inline
  def apply(source: Activity = null): ActivityLifecycleCallbackObject = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityLifecycleCallbackObject]
  }
}

