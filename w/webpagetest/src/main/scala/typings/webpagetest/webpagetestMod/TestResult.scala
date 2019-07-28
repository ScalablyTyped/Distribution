package typings.webpagetest.webpagetestMod

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
    val __obj = js.Dynamic.literal(average = average, bwDown = bwDown, bwUp = bwUp, completed = completed, connectivity = connectivity, from = from, fvonly = fvonly, id = id, latency = latency, location = location, median = median, mobile = mobile, plr = plr, runs = runs, standardDeviation = standardDeviation, successfulFVRuns = successfulFVRuns, summary = summary, testUrl = testUrl, tester = tester, testerDNS = testerDNS, url = url)
  
    __obj.asInstanceOf[TestResult]
  }
}

