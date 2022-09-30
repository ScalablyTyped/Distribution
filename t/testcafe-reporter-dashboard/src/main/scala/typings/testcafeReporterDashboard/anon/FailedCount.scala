package typings.testcafeReporterDashboard.anon

import typings.ioTs.mod.NumberC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedCount extends StObject {
  
  var failedCount: NumberC
  
  var passedCount: NumberC
  
  var skippedCount: NumberC
}
object FailedCount {
  
  inline def apply(failedCount: NumberC, passedCount: NumberC, skippedCount: NumberC): FailedCount = {
    val __obj = js.Dynamic.literal(failedCount = failedCount.asInstanceOf[js.Any], passedCount = passedCount.asInstanceOf[js.Any], skippedCount = skippedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedCount]
  }
  
  extension [Self <: FailedCount](x: Self) {
    
    inline def setFailedCount(value: NumberC): Self = StObject.set(x, "failedCount", value.asInstanceOf[js.Any])
    
    inline def setPassedCount(value: NumberC): Self = StObject.set(x, "passedCount", value.asInstanceOf[js.Any])
    
    inline def setSkippedCount(value: NumberC): Self = StObject.set(x, "skippedCount", value.asInstanceOf[js.Any])
  }
}
