package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Declined extends StObject {
  
  var completed: scala.Double
  
  var declined: scala.Double
  
  var inProgress: scala.Double
  
  var notStarted: scala.Double
  
  var paused: scala.Double
  
  var unspecified: scala.Double
}
object Declined {
  
  inline def apply(
    completed: scala.Double,
    declined: scala.Double,
    inProgress: scala.Double,
    notStarted: scala.Double,
    paused: scala.Double,
    unspecified: scala.Double
  ): Declined = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], declined = declined.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], unspecified = unspecified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Declined] (val x: Self) extends AnyVal {
    
    inline def setCompleted(value: scala.Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setDeclined(value: scala.Double): Self = StObject.set(x, "declined", value.asInstanceOf[js.Any])
    
    inline def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    inline def setNotStarted(value: scala.Double): Self = StObject.set(x, "notStarted", value.asInstanceOf[js.Any])
    
    inline def setPaused(value: scala.Double): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setUnspecified(value: scala.Double): Self = StObject.set(x, "unspecified", value.asInstanceOf[js.Any])
  }
}
