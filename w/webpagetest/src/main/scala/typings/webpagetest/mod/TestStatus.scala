package typings.webpagetest.mod

import typings.webpagetest.webpagetestBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestStatus extends js.Object {
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
}

