package typings.testcafeReporterDashboard.libTypesTestcafeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WarningsInfo extends StObject {
  
  var testRunId: js.UndefOr[String] = js.undefined
  
  var warnings: js.Array[Warning]
}
object WarningsInfo {
  
  inline def apply(warnings: js.Array[Warning]): WarningsInfo = {
    val __obj = js.Dynamic.literal(warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[WarningsInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WarningsInfo] (val x: Self) extends AnyVal {
    
    inline def setTestRunId(value: String): Self = StObject.set(x, "testRunId", value.asInstanceOf[js.Any])
    
    inline def setTestRunIdUndefined: Self = StObject.set(x, "testRunId", js.undefined)
    
    inline def setWarnings(value: js.Array[Warning]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: Warning*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
