package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancelling extends StObject {
  
  var all: scala.Double
  
  var cancelling: scala.Double
  
  var completed: scala.Double
  
  var inProgress: scala.Double
  
  var none: scala.Double
  
  var notStarted: scala.Double
  
  var postponed: scala.Double
}
object Cancelling {
  
  inline def apply(
    all: scala.Double,
    cancelling: scala.Double,
    completed: scala.Double,
    inProgress: scala.Double,
    none: scala.Double,
    notStarted: scala.Double,
    postponed: scala.Double
  ): Cancelling = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], cancelling = cancelling.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], postponed = postponed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelling]
  }
  
  extension [Self <: Cancelling](x: Self) {
    
    inline def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setCancelling(value: scala.Double): Self = StObject.set(x, "cancelling", value.asInstanceOf[js.Any])
    
    inline def setCompleted(value: scala.Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNotStarted(value: scala.Double): Self = StObject.set(x, "notStarted", value.asInstanceOf[js.Any])
    
    inline def setPostponed(value: scala.Double): Self = StObject.set(x, "postponed", value.asInstanceOf[js.Any])
  }
}
