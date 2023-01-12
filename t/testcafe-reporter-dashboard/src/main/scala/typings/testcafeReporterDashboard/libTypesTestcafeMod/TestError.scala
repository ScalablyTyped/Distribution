package typings.testcafeReporterDashboard.libTypesTestcafeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestError extends StObject {
  
  var code: String
  
  var errorModel: String
  
  var testRunPhase: String
}
object TestError {
  
  inline def apply(code: String, errorModel: String, testRunPhase: String): TestError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errorModel = errorModel.asInstanceOf[js.Any], testRunPhase = testRunPhase.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setErrorModel(value: String): Self = StObject.set(x, "errorModel", value.asInstanceOf[js.Any])
    
    inline def setTestRunPhase(value: String): Self = StObject.set(x, "testRunPhase", value.asInstanceOf[js.Any])
  }
}
