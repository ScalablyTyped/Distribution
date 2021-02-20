package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NeedsInvestigation extends StObject {
  
  var aborted: scala.Double = js.native
  
  var completed: scala.Double = js.native
  
  var inProgress: scala.Double = js.native
  
  var needsInvestigation: scala.Double = js.native
  
  var notStarted: scala.Double = js.native
  
  var unspecified: scala.Double = js.native
  
  var waiting: scala.Double = js.native
}
object NeedsInvestigation {
  
  @scala.inline
  def apply(
    aborted: scala.Double,
    completed: scala.Double,
    inProgress: scala.Double,
    needsInvestigation: scala.Double,
    notStarted: scala.Double,
    unspecified: scala.Double,
    waiting: scala.Double
  ): NeedsInvestigation = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], needsInvestigation = needsInvestigation.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], unspecified = unspecified.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedsInvestigation]
  }
  
  @scala.inline
  implicit class NeedsInvestigationMutableBuilder[Self <: NeedsInvestigation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAborted(value: scala.Double): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted(value: scala.Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedsInvestigation(value: scala.Double): Self = StObject.set(x, "needsInvestigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotStarted(value: scala.Double): Self = StObject.set(x, "notStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnspecified(value: scala.Double): Self = StObject.set(x, "unspecified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaiting(value: scala.Double): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
  }
}
