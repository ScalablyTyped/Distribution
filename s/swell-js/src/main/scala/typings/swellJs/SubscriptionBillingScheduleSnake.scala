package typings.swellJs

import typings.swellJs.swellJsStrings.daily
import typings.swellJs.swellJsStrings.monthly
import typings.swellJs.swellJsStrings.weekly
import typings.swellJs.swellJsStrings.yearly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionBillingScheduleSnake extends StObject {
  
  var date_limit_end: js.UndefOr[String] = js.undefined
  
  var interval: js.UndefOr[daily | weekly | monthly | yearly] = js.undefined
  
  var interval_count: js.UndefOr[Double] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var limit_current: js.UndefOr[Double] = js.undefined
  
  var trial_days: js.UndefOr[Double] = js.undefined
}
object SubscriptionBillingScheduleSnake {
  
  inline def apply(): SubscriptionBillingScheduleSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionBillingScheduleSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionBillingScheduleSnake] (val x: Self) extends AnyVal {
    
    inline def setDate_limit_end(value: String): Self = StObject.set(x, "date_limit_end", value.asInstanceOf[js.Any])
    
    inline def setDate_limit_endUndefined: Self = StObject.set(x, "date_limit_end", js.undefined)
    
    inline def setInterval(value: daily | weekly | monthly | yearly): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setInterval_count(value: Double): Self = StObject.set(x, "interval_count", value.asInstanceOf[js.Any])
    
    inline def setInterval_countUndefined: Self = StObject.set(x, "interval_count", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLimit_current(value: Double): Self = StObject.set(x, "limit_current", value.asInstanceOf[js.Any])
    
    inline def setLimit_currentUndefined: Self = StObject.set(x, "limit_current", js.undefined)
    
    inline def setTrial_days(value: Double): Self = StObject.set(x, "trial_days", value.asInstanceOf[js.Any])
    
    inline def setTrial_daysUndefined: Self = StObject.set(x, "trial_days", js.undefined)
  }
}
