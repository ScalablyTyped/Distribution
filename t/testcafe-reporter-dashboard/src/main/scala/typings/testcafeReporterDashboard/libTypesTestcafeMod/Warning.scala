package typings.testcafeReporterDashboard.libTypesTestcafeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Warning extends StObject {
  
  var message: String
  
  var testRunId: js.UndefOr[String] = js.undefined
}
object Warning {
  
  inline def apply(message: String): Warning = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Warning] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTestRunId(value: String): Self = StObject.set(x, "testRunId", value.asInstanceOf[js.Any])
    
    inline def setTestRunIdUndefined: Self = StObject.set(x, "testRunId", js.undefined)
  }
}
