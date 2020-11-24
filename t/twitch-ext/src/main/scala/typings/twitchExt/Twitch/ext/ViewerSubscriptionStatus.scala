package typings.twitchExt.Twitch.ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewerSubscriptionStatus extends js.Object {
  
  /**
    * This tier of the subscription.
    * Possible values are 1000, 200 and 300 for tier one, two and three subscriptions respectively.
    */
  var tier: String = js.native
}
object ViewerSubscriptionStatus {
  
  @scala.inline
  def apply(tier: String): ViewerSubscriptionStatus = {
    val __obj = js.Dynamic.literal(tier = tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewerSubscriptionStatus]
  }
  
  @scala.inline
  implicit class ViewerSubscriptionStatusOps[Self <: ViewerSubscriptionStatus] (val x: Self) extends AnyVal {
    
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
