package typings.twitchExt

import typings.twitchExt.twitchExtStrings.isBitsEnabled
import typings.twitchExt.twitchExtStrings.isChatEnabled
import typings.twitchExt.twitchExtStrings.isSubscriptionStatusAvailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see TwitchExt.features
  */
@js.native
trait TwitchExtFeatures extends TwitchExtFeatureFlags {
  /**
    * This function enables you to receive real-time updates to changes of the features object.
    * If this callback is invoked, you should re-check the Twitch.ext.features object for a change
    * to any feature flag your extension cares about.
    *
    * @param callback The callback is called with an array of feature flags which were updated.
    */
  def onChanged(
    callback: js.Function1[
      /* changed */ js.Array[isBitsEnabled | isChatEnabled | isSubscriptionStatusAvailable], 
      Unit
    ]
  ): Unit = js.native
}

object TwitchExtFeatures {
  @scala.inline
  def apply(
    isBitsEnabled: Boolean,
    isChatEnabled: Boolean,
    isSubscriptionStatusAvailable: Boolean,
    onChanged: js.Function1[
      /* changed */ js.Array[isBitsEnabled | isChatEnabled | isSubscriptionStatusAvailable], 
      Unit
    ] => Unit
  ): TwitchExtFeatures = {
    val __obj = js.Dynamic.literal(isBitsEnabled = isBitsEnabled.asInstanceOf[js.Any], isChatEnabled = isChatEnabled.asInstanceOf[js.Any], isSubscriptionStatusAvailable = isSubscriptionStatusAvailable.asInstanceOf[js.Any], onChanged = js.Any.fromFunction1(onChanged))
    __obj.asInstanceOf[TwitchExtFeatures]
  }
  @scala.inline
  implicit class TwitchExtFeaturesOps[Self <: TwitchExtFeatures] (val x: Self) extends AnyVal {
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
    def setOnChanged(
      value: js.Function1[
          /* changed */ js.Array[isBitsEnabled | isChatEnabled | isSubscriptionStatusAvailable], 
          Unit
        ] => Unit
    ): Self = this.set("onChanged", js.Any.fromFunction1(value))
  }
  
}

