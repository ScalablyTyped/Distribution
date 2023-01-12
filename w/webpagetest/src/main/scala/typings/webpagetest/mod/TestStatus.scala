package typings.webpagetest.mod

import typings.webpagetest.webpagetestBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestStatus extends StObject {
  
  var completeTime: String
  
  var elapsed: Double
  
  var fvRunsCompleted: Double
  
  var fvonly: Double
  
  var id: String
  
  var location: String
  
  var remote: `false`
  
  var runs: Double
  
  var rvRunsCompleted: Double
  
  var startTime: String
  
  var statusCode: Double
  
  var statusText: String
  
  var testId: String
  
  var testInfo: TestInfo
  
  var testsCompleted: Double
  
  var testsExpected: Double
}
object TestStatus {
  
  inline def apply(
    completeTime: String,
    elapsed: Double,
    fvRunsCompleted: Double,
    fvonly: Double,
    id: String,
    location: String,
    runs: Double,
    rvRunsCompleted: Double,
    startTime: String,
    statusCode: Double,
    statusText: String,
    testId: String,
    testInfo: TestInfo,
    testsCompleted: Double,
    testsExpected: Double
  ): TestStatus = {
    val __obj = js.Dynamic.literal(completeTime = completeTime.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any], fvRunsCompleted = fvRunsCompleted.asInstanceOf[js.Any], fvonly = fvonly.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], remote = false, runs = runs.asInstanceOf[js.Any], rvRunsCompleted = rvRunsCompleted.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any], testInfo = testInfo.asInstanceOf[js.Any], testsCompleted = testsCompleted.asInstanceOf[js.Any], testsExpected = testsExpected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestStatus] (val x: Self) extends AnyVal {
    
    inline def setCompleteTime(value: String): Self = StObject.set(x, "completeTime", value.asInstanceOf[js.Any])
    
    inline def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
    
    inline def setFvRunsCompleted(value: Double): Self = StObject.set(x, "fvRunsCompleted", value.asInstanceOf[js.Any])
    
    inline def setFvonly(value: Double): Self = StObject.set(x, "fvonly", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setRemote(value: `false`): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    inline def setRuns(value: Double): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    inline def setRvRunsCompleted(value: Double): Self = StObject.set(x, "rvRunsCompleted", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
    
    inline def setTestInfo(value: TestInfo): Self = StObject.set(x, "testInfo", value.asInstanceOf[js.Any])
    
    inline def setTestsCompleted(value: Double): Self = StObject.set(x, "testsCompleted", value.asInstanceOf[js.Any])
    
    inline def setTestsExpected(value: Double): Self = StObject.set(x, "testsExpected", value.asInstanceOf[js.Any])
  }
}
