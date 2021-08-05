package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionQueryCondition extends StObject {
  
  /**
    * Filter conditions that matching subscriptions must have. Typically only the filter's type and event type are used for matching.
    */
  var filter: ISubscriptionFilter
  
  /**
    * Flags to specify the the type subscriptions to query for.
    */
  var flags: SubscriptionFlags
  
  /**
    * Scope that matching subscriptions must have.
    */
  var scope: String
  
  /**
    * ID of the subscriber (user or group) that matching subscriptions must be subscribed to.
    */
  var subscriberId: String
  
  /**
    * ID of the subscription to query for.
    */
  var subscriptionId: String
}
object SubscriptionQueryCondition {
  
  inline def apply(
    filter: ISubscriptionFilter,
    flags: SubscriptionFlags,
    scope: String,
    subscriberId: String,
    subscriptionId: String
  ): SubscriptionQueryCondition = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], subscriberId = subscriberId.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionQueryCondition]
  }
  
  extension [Self <: SubscriptionQueryCondition](x: Self) {
    
    inline def setFilter(value: ISubscriptionFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: SubscriptionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setSubscriberId(value: String): Self = StObject.set(x, "subscriberId", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
  }
}
