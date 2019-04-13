package typings
package webpagetestLib.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestStatus extends js.Object {
  var completeTime: java.lang.String
  var elapsed: scala.Double
  var fvRunsCompleted: scala.Double
  var fvonly: scala.Double
  var id: java.lang.String
  var location: java.lang.String
  var remote: webpagetestLib.webpagetestLibNumbers.`false`
  var runs: scala.Double
  var rvRunsCompleted: scala.Double
  var startTime: java.lang.String
  var statusCode: scala.Double
  var statusText: java.lang.String
  var testId: java.lang.String
  var testInfo: TestInfo
  var testsCompleted: scala.Double
  var testsExpected: scala.Double
}

object TestStatus {
  @scala.inline
  def apply(
    completeTime: java.lang.String,
    elapsed: scala.Double,
    fvRunsCompleted: scala.Double,
    fvonly: scala.Double,
    id: java.lang.String,
    location: java.lang.String,
    remote: webpagetestLib.webpagetestLibNumbers.`false`,
    runs: scala.Double,
    rvRunsCompleted: scala.Double,
    startTime: java.lang.String,
    statusCode: scala.Double,
    statusText: java.lang.String,
    testId: java.lang.String,
    testInfo: TestInfo,
    testsCompleted: scala.Double,
    testsExpected: scala.Double
  ): TestStatus = {
    val __obj = js.Dynamic.literal(completeTime = completeTime, elapsed = elapsed, fvRunsCompleted = fvRunsCompleted, fvonly = fvonly, id = id, location = location, remote = remote, runs = runs, rvRunsCompleted = rvRunsCompleted, startTime = startTime, statusCode = statusCode, statusText = statusText, testId = testId, testInfo = testInfo, testsCompleted = testsCompleted, testsExpected = testsExpected)
  
    __obj.asInstanceOf[TestStatus]
  }
}

