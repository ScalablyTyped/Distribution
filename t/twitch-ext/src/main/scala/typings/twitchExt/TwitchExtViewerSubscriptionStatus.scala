package typings.twitchExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwitchExtViewerSubscriptionStatus extends js.Object {
  /**
    * This tier of the subscription.
    * Possible values are 1000, 200 and 300 for tier one, two and three subscriptions respectively.
    */
  var tier: String = js.native
}

object TwitchExtViewerSubscriptionStatus {
  @scala.inline
  def apply(tier: String): TwitchExtViewerSubscriptionStatus = {
    val __obj = js.Dynamic.literal(tier = tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchExtViewerSubscriptionStatus]
  }
  @scala.inline
  implicit class TwitchExtViewerSubscriptionStatusOps[Self <: TwitchExtViewerSubscriptionStatus] (val x: Self) extends AnyVal {
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
    def setTier(value: String): Self = this.set("tier", value.asInstanceOf[js.Any])
  }
  
}

