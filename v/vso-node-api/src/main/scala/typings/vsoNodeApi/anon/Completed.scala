package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Completed extends StObject {
  
  var completed: scala.Double
  
  var inProgress: scala.Double
  
  var pending: scala.Double
}
object Completed {
  
  inline def apply(completed: scala.Double, inProgress: scala.Double, pending: scala.Double): Completed = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Completed]
  }
  
  extension [Self <: Completed](x: Self) {
    
    inline def setCompleted(value: scala.Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    inline def setPending(value: scala.Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
  }
}
