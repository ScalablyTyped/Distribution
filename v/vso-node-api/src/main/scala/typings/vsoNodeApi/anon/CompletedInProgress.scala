package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletedInProgress extends StObject {
  
  var completed: scala.Double
  
  var inProgress: scala.Double
  
  var queued: scala.Double
}
object CompletedInProgress {
  
  inline def apply(completed: scala.Double, inProgress: scala.Double, queued: scala.Double): CompletedInProgress = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedInProgress]
  }
  
  extension [Self <: CompletedInProgress](x: Self) {
    
    inline def setCompleted(value: scala.Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    inline def setQueued(value: scala.Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
  }
}
