package typings
package webpagetestLib.webpagetestMod.WebPageTestNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("completeTime")(completeTime)
    __obj.updateDynamic("elapsed")(elapsed)
    __obj.updateDynamic("fvRunsCompleted")(fvRunsCompleted)
    __obj.updateDynamic("fvonly")(fvonly)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("remote")(remote)
    __obj.updateDynamic("runs")(runs)
    __obj.updateDynamic("rvRunsCompleted")(rvRunsCompleted)
    __obj.updateDynamic("startTime")(startTime)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.updateDynamic("statusText")(statusText)
    __obj.updateDynamic("testId")(testId)
    __obj.updateDynamic("testInfo")(testInfo)
    __obj.updateDynamic("testsCompleted")(testsCompleted)
    __obj.updateDynamic("testsExpected")(testsExpected)
    __obj.asInstanceOf[TestStatus]
  }
}

