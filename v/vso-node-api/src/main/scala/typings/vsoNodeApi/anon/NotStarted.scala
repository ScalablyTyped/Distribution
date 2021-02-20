package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotStarted extends StObject {
  
  var canceled: scala.Double = js.native
  
  var cancelling: scala.Double = js.native
  
  var failed: scala.Double = js.native
  
  var inProgress: scala.Double = js.native
  
  var notStarted: scala.Double = js.native
  
  var partiallySucceeded: scala.Double = js.native
  
  var skipped: scala.Double = js.native
  
  var succeeded: scala.Double = js.native
  
  var undefined: scala.Double = js.native
}
object NotStarted {
  
  @scala.inline
  def apply(
    canceled: scala.Double,
    cancelling: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    notStarted: scala.Double,
    partiallySucceeded: scala.Double,
    skipped: scala.Double,
    succeeded: scala.Double,
    undefined: scala.Double
  ): NotStarted = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], cancelling = cancelling.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotStarted]
  }
  
  @scala.inline
  implicit class NotStartedMutableBuilder[Self <: NotStarted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanceled(value: scala.Double): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelling(value: scala.Double): Self = StObject.set(x, "cancelling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailed(value: scala.Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotStarted(value: scala.Double): Self = StObject.set(x, "notStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartiallySucceeded(value: scala.Double): Self = StObject.set(x, "partiallySucceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipped(value: scala.Double): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: scala.Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefined(value: scala.Double): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
  }
}
