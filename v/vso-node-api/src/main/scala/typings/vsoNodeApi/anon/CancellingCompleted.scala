package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancellingCompleted extends StObject {
  
  var cancelling: scala.Double
  
  var completed: scala.Double
  
  var inProgress: scala.Double
  
  var queued: scala.Double
}
object CancellingCompleted {
  
  @scala.inline
  def apply(cancelling: scala.Double, completed: scala.Double, inProgress: scala.Double, queued: scala.Double): CancellingCompleted = {
    val __obj = js.Dynamic.literal(cancelling = cancelling.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancellingCompleted]
  }
  
  @scala.inline
  implicit class CancellingCompletedMutableBuilder[Self <: CancellingCompleted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelling(value: scala.Double): Self = StObject.set(x, "cancelling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted(value: scala.Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueued(value: scala.Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
  }
}
