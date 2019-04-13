package typings
package webpagetestLib.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResult extends js.Object {
  var average: TestRun
  var bwDown: scala.Double
  var bwUp: scala.Double
  var completed: scala.Double
  var connectivity: java.lang.String
  var from: java.lang.String
  var fvonly: scala.Boolean
  var id: java.lang.String
  var latency: scala.Double
  var location: java.lang.String
  var median: TestRun
  var mobile: scala.Double
  var plr: java.lang.String
  var runs: org.scalablytyped.runtime.StringDictionary[TestRun]
  var standardDeviation: TestRun
  var successfulFVRuns: scala.Double
  var summary: java.lang.String
  var testUrl: java.lang.String
  var tester: java.lang.String
  var testerDNS: java.lang.String
  var url: java.lang.String
}

object TestResult {
  @scala.inline
  def apply(
    average: TestRun,
    bwDown: scala.Double,
    bwUp: scala.Double,
    completed: scala.Double,
    connectivity: java.lang.String,
    from: java.lang.String,
    fvonly: scala.Boolean,
    id: java.lang.String,
    latency: scala.Double,
    location: java.lang.String,
    median: TestRun,
    mobile: scala.Double,
    plr: java.lang.String,
    runs: org.scalablytyped.runtime.StringDictionary[TestRun],
    standardDeviation: TestRun,
    successfulFVRuns: scala.Double,
    summary: java.lang.String,
    testUrl: java.lang.String,
    tester: java.lang.String,
    testerDNS: java.lang.String,
    url: java.lang.String
  ): TestResult = {
    val __obj = js.Dynamic.literal(average = average, bwDown = bwDown, bwUp = bwUp, completed = completed, connectivity = connectivity, from = from, fvonly = fvonly, id = id, latency = latency, location = location, median = median, mobile = mobile, plr = plr, runs = runs, standardDeviation = standardDeviation, successfulFVRuns = successfulFVRuns, summary = summary, testUrl = testUrl, tester = tester, testerDNS = testerDNS, url = url)
  
    __obj.asInstanceOf[TestResult]
  }
}

