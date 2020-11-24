package typings.webpagetest.mod

import typings.webpagetest.webpagetestBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestStatus extends js.Object {
  
  var completeTime: String = js.native
  
  var elapsed: Double = js.native
  
  var fvRunsCompleted: Double = js.native
  
  var fvonly: Double = js.native
  
  var id: String = js.native
  
  var location: String = js.native
  
  var remote: `false` = js.native
  
  var runs: Double = js.native
  
  var rvRunsCompleted: Double = js.native
  
  var startTime: String = js.native
  
  var statusCode: Double = js.native
  
  var statusText: String = js.native
  
  var testId: String = js.native
  
  var testInfo: TestInfo = js.native
  
  var testsCompleted: Double = js.native
  
  var testsExpected: Double = js.native
}
object TestStatus {
  
  @scala.inline
  def apply(
    completeTime: String,
    elapsed: Double,
    fvRunsCompleted: Double,
    fvonly: Double,
    id: String,
    location: String,
    remote: `false`,
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
    val __obj = js.Dynamic.literal(completeTime = completeTime.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any], fvRunsCompleted = fvRunsCompleted.asInstanceOf[js.Any], fvonly = fvonly.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any], rvRunsCompleted = rvRunsCompleted.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any], testInfo = testInfo.asInstanceOf[js.Any], testsCompleted = testsCompleted.asInstanceOf[js.Any], testsExpected = testsExpected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestStatus]
  }
  
  @scala.inline
  implicit class TestStatusOps[Self <: TestStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompleteTime(value: String): Self = this.set("completeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsed(value: Double): Self = this.set("elapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFvRunsCompleted(value: Double): Self = this.set("fvRunsCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFvonly(value: Double): Self = this.set("fvonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemote(value: `false`): Self = this.set("remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuns(value: Double): Self = this.set("runs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRvRunsCompleted(value: Double): Self = this.set("rvRunsCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestId(value: String): Self = this.set("testId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestInfo(value: TestInfo): Self = this.set("testInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestsCompleted(value: Double): Self = this.set("testsCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestsExpected(value: Double): Self = this.set("testsExpected", value.asInstanceOf[js.Any])
  }
}
