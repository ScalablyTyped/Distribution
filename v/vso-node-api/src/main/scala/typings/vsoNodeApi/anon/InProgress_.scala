package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InProgress_ extends StObject {
  
  var abandoned: scala.Double
  
  var completed: scala.Double
  
  var failed: scala.Double
  
  var inProgress: scala.Double
  
  var queued: scala.Double
}
object InProgress_ {
  
  @scala.inline
  def apply(
    abandoned: scala.Double,
    completed: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    queued: scala.Double
  ): InProgress_ = {
    val __obj = js.Dynamic.literal(abandoned = abandoned.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any])
    __obj.asInstanceOf[InProgress_]
  }
  
  @scala.inline
  implicit class InProgress_MutableBuilder[Self <: InProgress_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbandoned(value: scala.Double): Self = StObject.set(x, "abandoned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted(value: scala.Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailed(value: scala.Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueued(value: scala.Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
  }
}
