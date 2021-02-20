package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestCaseResultIdentifier extends StObject {
  
  var testResultId: Double = js.native
  
  var testRunId: Double = js.native
}
object TestCaseResultIdentifier {
  
  @scala.inline
  def apply(testResultId: Double, testRunId: Double): TestCaseResultIdentifier = {
    val __obj = js.Dynamic.literal(testResultId = testResultId.asInstanceOf[js.Any], testRunId = testRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCaseResultIdentifier]
  }
  
  @scala.inline
  implicit class TestCaseResultIdentifierMutableBuilder[Self <: TestCaseResultIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTestResultId(value: Double): Self = StObject.set(x, "testResultId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestRunId(value: Double): Self = StObject.set(x, "testRunId", value.asInstanceOf[js.Any])
  }
}
