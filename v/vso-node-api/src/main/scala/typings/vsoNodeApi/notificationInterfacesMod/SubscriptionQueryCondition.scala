package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionQueryCondition extends js.Object {
  
  /**
    * Filter conditions that matching subscriptions must have. Typically only the filter's type and event type are used for matching.
    */
  var filter: ISubscriptionFilter = js.native
  
  /**
    * Flags to specify the the type subscriptions to query for.
    */
  var flags: SubscriptionFlags = js.native
  
  /**
    * Scope that matching subscriptions must have.
    */
  var scope: String = js.native
  
  /**
    * ID of the subscriber (user or group) that matching subscriptions must be subscribed to.
    */
  var subscriberId: String = js.native
  
  /**
    * ID of the subscription to query for.
    */
  var subscriptionId: String = js.native
}
object SubscriptionQueryCondition {
  
  @scala.inline
  def apply(
    filter: ISubscriptionFilter,
    flags: SubscriptionFlags,
    scope: String,
    subscriberId: String,
    subscriptionId: String
  ): SubscriptionQueryCondition = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], subscriberId = subscriberId.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionQueryCondition]
  }
  
  @scala.inline
  implicit class SubscriptionQueryConditionOps[Self <: SubscriptionQueryCondition] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: ISubscriptionFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: SubscriptionFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriberId(value: String): Self = this.set("subscriberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionId(value: String): Self = this.set("subscriptionId", value.asInstanceOf[js.Any])
  }
}
