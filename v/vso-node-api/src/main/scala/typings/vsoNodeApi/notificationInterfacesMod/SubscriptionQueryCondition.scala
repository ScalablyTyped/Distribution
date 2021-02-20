package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionQueryCondition extends StObject {
  
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
  implicit class SubscriptionQueryConditionMutableBuilder[Self <: SubscriptionQueryCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: ISubscriptionFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: SubscriptionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriberId(value: String): Self = StObject.set(x, "subscriberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
  }
}
