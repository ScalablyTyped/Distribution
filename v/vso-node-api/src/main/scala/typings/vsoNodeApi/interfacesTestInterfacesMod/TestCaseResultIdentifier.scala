package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestCaseResultIdentifier extends StObject {
  
  var testResultId: Double
  
  var testRunId: Double
}
object TestCaseResultIdentifier {
  
  inline def apply(testResultId: Double, testRunId: Double): TestCaseResultIdentifier = {
    val __obj = js.Dynamic.literal(testResultId = testResultId.asInstanceOf[js.Any], testRunId = testRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCaseResultIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestCaseResultIdentifier] (val x: Self) extends AnyVal {
    
    inline def setTestResultId(value: Double): Self = StObject.set(x, "testResultId", value.asInstanceOf[js.Any])
    
    inline def setTestRunId(value: Double): Self = StObject.set(x, "testRunId", value.asInstanceOf[js.Any])
  }
}
