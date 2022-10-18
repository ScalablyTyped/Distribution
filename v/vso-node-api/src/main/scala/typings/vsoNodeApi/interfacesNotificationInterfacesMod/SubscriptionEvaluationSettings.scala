package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionEvaluationSettings extends StObject {
  
  /**
    * Indicates whether subscription evaluation before saving is enabled or not
    */
  var enabled: Boolean
  
  /**
    * Time interval to check on subscription evaluation job in seconds
    */
  var interval: Double
  
  /**
    * Threshold on the number of notifications for considering a subscription too noisy
    */
  var threshold: Double
  
  /**
    * Time out for the subscription evaluation check in seconds
    */
  var timeOut: Double
}
object SubscriptionEvaluationSettings {
  
  inline def apply(enabled: Boolean, interval: Double, threshold: Double, timeOut: Double): SubscriptionEvaluationSettings = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], timeOut = timeOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionEvaluationSettings]
  }
  
  extension [Self <: SubscriptionEvaluationSettings](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setTimeOut(value: Double): Self = StObject.set(x, "timeOut", value.asInstanceOf[js.Any])
  }
}
