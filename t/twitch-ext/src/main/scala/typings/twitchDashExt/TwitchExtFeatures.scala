package typings.twitchDashExt

import typings.twitchDashExt.twitchDashExtStrings.isChatEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see TwitchExt.features
  */
trait TwitchExtFeatures extends TwitchExtFeatureFlags {
  /**
  	 * This function enables you to receive real-time updates to changes of the features object.
  	 * If this callback is invoked, you should re-check the Twitch.ext.features object for a change
  	 * to any feature flag your extension cares about.
  	 *
  	 * @param callback The callback is called with an array of feature flags which were updated.
  	 */
  @JSName("onChanged")
  def onChanged_isChatEnabled(callback: js.Function1[/* changed */ js.Array[isChatEnabled], Unit]): Unit
}

object TwitchExtFeatures {
  @scala.inline
  def apply(
    isChatEnabled: Boolean,
    onChanged: js.Function1[/* changed */ js.Array[isChatEnabled], Unit] => Unit
  ): TwitchExtFeatures = {
    val __obj = js.Dynamic.literal(isChatEnabled = isChatEnabled.asInstanceOf[js.Any], onChanged = js.Any.fromFunction1(onChanged))
  
    __obj.asInstanceOf[TwitchExtFeatures]
  }
}

