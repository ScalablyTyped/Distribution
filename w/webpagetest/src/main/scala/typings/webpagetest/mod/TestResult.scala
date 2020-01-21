package typings.webpagetest.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResult extends js.Object {
  var average: TestRun
  var bwDown: Double
  var bwUp: Double
  var completed: Double
  var connectivity: String
  var from: String
  var fvonly: Boolean
  var id: String
  var latency: Double
  var location: String
  var median: TestRun
  var mobile: Double
  var plr: String
  var runs: StringDictionary[TestRun]
  var standardDeviation: TestRun
  var successfulFVRuns: Double
  var summary: String
  var testUrl: String
  var tester: String
  var testerDNS: String
  var url: String
}

object TestResult {
  @scala.inline
  def apply(
    average: TestRun,
    bwDown: Double,
    bwUp: Double,
    completed: Double,
    connectivity: String,
    from: String,
    fvonly: Boolean,
    id: String,
    latency: Double,
    location: String,
    median: TestRun,
    mobile: Double,
    plr: String,
    runs: StringDictionary[TestRun],
    standardDeviation: TestRun,
    successfulFVRuns: Double,
    summary: String,
    testUrl: String,
    tester: String,
    testerDNS: String,
    url: String
  ): TestResult = {
    val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], bwDown = bwDown.asInstanceOf[js.Any], bwUp = bwUp.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], connectivity = connectivity.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], fvonly = fvonly.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], median = median.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], plr = plr.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any], standardDeviation = standardDeviation.asInstanceOf[js.Any], successfulFVRuns = successfulFVRuns.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], testUrl = testUrl.asInstanceOf[js.Any], tester = tester.asInstanceOf[js.Any], testerDNS = testerDNS.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestResult]
  }
}

