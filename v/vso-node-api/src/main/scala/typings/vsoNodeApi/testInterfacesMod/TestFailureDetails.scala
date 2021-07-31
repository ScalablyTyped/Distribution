package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestFailureDetails extends StObject {
  
  var count: Double
  
  var testResults: js.Array[TestCaseResultIdentifier]
}
object TestFailureDetails {
  
  @scala.inline
  def apply(count: Double, testResults: js.Array[TestCaseResultIdentifier]): TestFailureDetails = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestFailureDetails]
  }
  
  @scala.inline
  implicit class TestFailureDetailsMutableBuilder[Self <: TestFailureDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResults(value: js.Array[TestCaseResultIdentifier]): Self = StObject.set(x, "testResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResultsVarargs(value: TestCaseResultIdentifier*): Self = StObject.set(x, "testResults", js.Array(value :_*))
  }
}
