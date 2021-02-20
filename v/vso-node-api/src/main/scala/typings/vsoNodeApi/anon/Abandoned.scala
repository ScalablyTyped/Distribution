package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Abandoned extends StObject {
  
  var abandoned: scala.Double = js.native
  
  var canceled: scala.Double = js.native
  
  var failed: scala.Double = js.native
  
  var skipped: scala.Double = js.native
  
  var succeeded: scala.Double = js.native
  
  var succeededWithIssues: scala.Double = js.native
}
object Abandoned {
  
  @scala.inline
  def apply(
    abandoned: scala.Double,
    canceled: scala.Double,
    failed: scala.Double,
    skipped: scala.Double,
    succeeded: scala.Double,
    succeededWithIssues: scala.Double
  ): Abandoned = {
    val __obj = js.Dynamic.literal(abandoned = abandoned.asInstanceOf[js.Any], canceled = canceled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], succeededWithIssues = succeededWithIssues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abandoned]
  }
  
  @scala.inline
  implicit class AbandonedMutableBuilder[Self <: Abandoned] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbandoned(value: scala.Double): Self = StObject.set(x, "abandoned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanceled(value: scala.Double): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailed(value: scala.Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipped(value: scala.Double): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: scala.Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceededWithIssues(value: scala.Double): Self = StObject.set(x, "succeededWithIssues", value.asInstanceOf[js.Any])
  }
}
