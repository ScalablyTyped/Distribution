package typings.twitchExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitchExtFeatureFlags extends js.Object {
  /**
    * If this flag is true, Bits in Extensions features will work in your extension on the current channel.
    * If this flag is false, disable or hide the Bits in Extensions features in your extension.
    */
  var isBitsEnabled: Boolean
  /**
    * If this flag is true, you can send a chat message to the current channel using Send Extension Chat Message
    * (subject to the authentication requirements documented for that endpoint).
    */
  var isChatEnabled: Boolean
  /**
    * If this flag is true, your extension has the ability to get the subscription status of identity-linked viewers
    * from both the helper in the twitch.ext.viewer.subscriptionStatus object and via the Twitch API.
    */
  var isSubscriptionStatusAvailable: Boolean
}

object TwitchExtFeatureFlags {
  @scala.inline
  def apply(isBitsEnabled: Boolean, isChatEnabled: Boolean, isSubscriptionStatusAvailable: Boolean): TwitchExtFeatureFlags = {
    val __obj = js.Dynamic.literal(isBitsEnabled = isBitsEnabled.asInstanceOf[js.Any], isChatEnabled = isChatEnabled.asInstanceOf[js.Any], isSubscriptionStatusAvailable = isSubscriptionStatusAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchExtFeatureFlags]
  }
}

