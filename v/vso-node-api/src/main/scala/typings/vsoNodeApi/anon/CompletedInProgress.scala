package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletedInProgress extends StObject {
  
  var completed: scala.Double = js.native
  
  var inProgress: scala.Double = js.native
  
  var queued: scala.Double = js.native
}
object CompletedInProgress {
  
  @scala.inline
  def apply(completed: scala.Double, inProgress: scala.Double, queued: scala.Double): CompletedInProgress = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedInProgress]
  }
  
  @scala.inline
  implicit class CompletedInProgressMutableBuilder[Self <: CompletedInProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleted(value: scala.Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueued(value: scala.Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
  }
}
