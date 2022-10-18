package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestRunCoverage extends StObject {
  
  var lastError: String
  
  var modules: js.Array[ModuleCoverage]
  
  var state: String
  
  var testRun: ShallowReference
}
object TestRunCoverage {
  
  inline def apply(lastError: String, modules: js.Array[ModuleCoverage], state: String, testRun: ShallowReference): TestRunCoverage = {
    val __obj = js.Dynamic.literal(lastError = lastError.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], testRun = testRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRunCoverage]
  }
  
  extension [Self <: TestRunCoverage](x: Self) {
    
    inline def setLastError(value: String): Self = StObject.set(x, "lastError", value.asInstanceOf[js.Any])
    
    inline def setModules(value: js.Array[ModuleCoverage]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesVarargs(value: ModuleCoverage*): Self = StObject.set(x, "modules", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTestRun(value: ShallowReference): Self = StObject.set(x, "testRun", value.asInstanceOf[js.Any])
  }
}
