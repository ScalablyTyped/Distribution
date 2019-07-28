package typings.webpagetest.webpagetestMod

import typings.webpagetest.webpagetestNumbers.`false`
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
    val __obj = js.Dynamic.literal(completeTime = completeTime, elapsed = elapsed, fvRunsCompleted = fvRunsCompleted, fvonly = fvonly, id = id, location = location, remote = remote, runs = runs, rvRunsCompleted = rvRunsCompleted, startTime = startTime, statusCode = statusCode, statusText = statusText, testId = testId, testInfo = testInfo, testsCompleted = testsCompleted, testsExpected = testsExpected)
  
    __obj.asInstanceOf[TestStatus]
  }
}

