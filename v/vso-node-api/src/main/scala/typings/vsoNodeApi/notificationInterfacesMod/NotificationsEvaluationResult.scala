package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationsEvaluationResult extends StObject {
  
  /**
    * Count of generated notifications
    */
  var count: Double
}
object NotificationsEvaluationResult {
  
  inline def apply(count: Double): NotificationsEvaluationResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsEvaluationResult]
  }
  
  extension [Self <: NotificationsEvaluationResult](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
