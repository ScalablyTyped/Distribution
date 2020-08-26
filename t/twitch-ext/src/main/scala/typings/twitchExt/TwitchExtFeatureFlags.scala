package typings.twitchExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwitchExtFeatureFlags extends js.Object {
  /**
    * If this flag is true, Bits in Extensions features will work in your extension on the current channel.
    * If this flag is false, disable or hide the Bits in Extensions features in your extension.
    */
  var isBitsEnabled: Boolean = js.native
  /**
    * If this flag is true, you can send a chat message to the current channel using Send Extension Chat Message
    * (subject to the authentication requirements documented for that endpoint).
    */
  var isChatEnabled: Boolean = js.native
  /**
    * If this flag is true, your extension has the ability to get the subscription status of identity-linked viewers
    * from both the helper in the twitch.ext.viewer.subscriptionStatus object and via the Twitch API.
    */
  var isSubscriptionStatusAvailable: Boolean = js.native
}

object TwitchExtFeatureFlags {
  @scala.inline
  def apply(isBitsEnabled: Boolean, isChatEnabled: Boolean, isSubscriptionStatusAvailable: Boolean): TwitchExtFeatureFlags = {
    val __obj = js.Dynamic.literal(isBitsEnabled = isBitsEnabled.asInstanceOf[js.Any], isChatEnabled = isChatEnabled.asInstanceOf[js.Any], isSubscriptionStatusAvailable = isSubscriptionStatusAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchExtFeatureFlags]
  }
  @scala.inline
  implicit class TwitchExtFeatureFlagsOps[Self <: TwitchExtFeatureFlags] (val x: Self) extends AnyVal {
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
    def setIsBitsEnabled(value: Boolean): Self = this.set("isBitsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsChatEnabled(value: Boolean): Self = this.set("isChatEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSubscriptionStatusAvailable(value: Boolean): Self = this.set("isSubscriptionStatusAvailable", value.asInstanceOf[js.Any])
  }
  
}

