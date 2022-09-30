package typings.testcafeReporterDashboard.testcafeMod

import typings.std.Record
import typings.testcafeReporterDashboard.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionInfo extends StObject {
  
  var apiName: String
  
  var command: (Record[String, Any]) & Type
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var error: js.UndefOr[TestError] = js.undefined
  
  var testPhase: TestPhase
}
object ActionInfo {
  
  inline def apply(apiName: String, command: (Record[String, Any]) & Type, testPhase: TestPhase): ActionInfo = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], testPhase = testPhase.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionInfo]
  }
  
  extension [Self <: ActionInfo](x: Self) {
    
    inline def setApiName(value: String): Self = StObject.set(x, "apiName", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: (Record[String, Any]) & Type): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setError(value: TestError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setTestPhase(value: TestPhase): Self = StObject.set(x, "testPhase", value.asInstanceOf[js.Any])
  }
}
