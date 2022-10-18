package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionQuery extends StObject {
  
  /**
    * One or more conditions to query on. If more than 2 conditions are specified, the combined results of each condition is returned (i.e. conditions are logically OR'ed).
    */
  var conditions: js.Array[SubscriptionQueryCondition]
  
  /**
    * Flags the refine the types of subscriptions that will be returned from the query.
    */
  var queryFlags: SubscriptionQueryFlags
}
object SubscriptionQuery {
  
  inline def apply(conditions: js.Array[SubscriptionQueryCondition], queryFlags: SubscriptionQueryFlags): SubscriptionQuery = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], queryFlags = queryFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionQuery]
  }
  
  extension [Self <: SubscriptionQuery](x: Self) {
    
    inline def setConditions(value: js.Array[SubscriptionQueryCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: SubscriptionQueryCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setQueryFlags(value: SubscriptionQueryFlags): Self = StObject.set(x, "queryFlags", value.asInstanceOf[js.Any])
  }
}
