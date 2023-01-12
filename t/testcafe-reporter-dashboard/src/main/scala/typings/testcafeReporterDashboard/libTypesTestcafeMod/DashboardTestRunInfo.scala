package typings.testcafeReporterDashboard.libTypesTestcafeMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardTestRunInfo extends StObject {
  
  var browserRuns: Record[String, BrowserRunInfo]
  
  var quarantine: Quarantine | Null
  
  var unstable: Boolean
  
  var warnings: js.Array[String]
}
object DashboardTestRunInfo {
  
  inline def apply(browserRuns: Record[String, BrowserRunInfo], unstable: Boolean, warnings: js.Array[String]): DashboardTestRunInfo = {
    val __obj = js.Dynamic.literal(browserRuns = browserRuns.asInstanceOf[js.Any], unstable = unstable.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any], quarantine = null)
    __obj.asInstanceOf[DashboardTestRunInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DashboardTestRunInfo] (val x: Self) extends AnyVal {
    
    inline def setBrowserRuns(value: Record[String, BrowserRunInfo]): Self = StObject.set(x, "browserRuns", value.asInstanceOf[js.Any])
    
    inline def setQuarantine(value: Quarantine): Self = StObject.set(x, "quarantine", value.asInstanceOf[js.Any])
    
    inline def setQuarantineNull: Self = StObject.set(x, "quarantine", null)
    
    inline def setUnstable(value: Boolean): Self = StObject.set(x, "unstable", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
