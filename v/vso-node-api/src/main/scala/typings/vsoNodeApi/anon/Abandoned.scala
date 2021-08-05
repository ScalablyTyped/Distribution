package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Abandoned extends StObject {
  
  var abandoned: scala.Double
  
  var canceled: scala.Double
  
  var failed: scala.Double
  
  var skipped: scala.Double
  
  var succeeded: scala.Double
  
  var succeededWithIssues: scala.Double
}
object Abandoned {
  
  inline def apply(
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
  
  extension [Self <: Abandoned](x: Self) {
    
    inline def setAbandoned(value: scala.Double): Self = StObject.set(x, "abandoned", value.asInstanceOf[js.Any])
    
    inline def setCanceled(value: scala.Double): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    inline def setFailed(value: scala.Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setSkipped(value: scala.Double): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: scala.Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    inline def setSucceededWithIssues(value: scala.Double): Self = StObject.set(x, "succeededWithIssues", value.asInstanceOf[js.Any])
  }
}
