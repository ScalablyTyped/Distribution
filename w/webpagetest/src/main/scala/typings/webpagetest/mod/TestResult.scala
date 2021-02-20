package typings.webpagetest.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResult extends StObject {
  
  var average: TestRun = js.native
  
  var bwDown: Double = js.native
  
  var bwUp: Double = js.native
  
  var completed: Double = js.native
  
  var connectivity: String = js.native
  
  var from: String = js.native
  
  var fvonly: Boolean = js.native
  
  var id: String = js.native
  
  var latency: Double = js.native
  
  var location: String = js.native
  
  var median: TestRun = js.native
  
  var mobile: Double = js.native
  
  var plr: String = js.native
  
  var runs: StringDictionary[TestRun] = js.native
  
  var standardDeviation: TestRun = js.native
  
  var successfulFVRuns: Double = js.native
  
  var summary: String = js.native
  
  var testUrl: String = js.native
  
  var tester: String = js.native
  
  var testerDNS: String = js.native
  
  var url: String = js.native
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
  
  @scala.inline
  implicit class TestResultMutableBuilder[Self <: TestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverage(value: TestRun): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBwDown(value: Double): Self = StObject.set(x, "bwDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBwUp(value: Double): Self = StObject.set(x, "bwUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted(value: Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectivity(value: String): Self = StObject.set(x, "connectivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFvonly(value: Boolean): Self = StObject.set(x, "fvonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedian(value: TestRun): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile(value: Double): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlr(value: String): Self = StObject.set(x, "plr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuns(value: StringDictionary[TestRun]): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardDeviation(value: TestRun): Self = StObject.set(x, "standardDeviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulFVRuns(value: Double): Self = StObject.set(x, "successfulFVRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestUrl(value: String): Self = StObject.set(x, "testUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTester(value: String): Self = StObject.set(x, "tester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTesterDNS(value: String): Self = StObject.set(x, "testerDNS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
