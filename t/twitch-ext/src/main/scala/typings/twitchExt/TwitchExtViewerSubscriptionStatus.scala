package typings.twitchExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitchExtViewerSubscriptionStatus extends js.Object {
  /**
    * This tier of the subscription.
    * Possible values are 1000, 200 and 300 for tier one, two and three subscriptions respectively.
    */
  var tier: String
}

object TwitchExtViewerSubscriptionStatus {
  @scala.inline
  def apply(tier: String): TwitchExtViewerSubscriptionStatus = {
    val __obj = js.Dynamic.literal(tier = tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchExtViewerSubscriptionStatus]
  }
}

