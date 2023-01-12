package typings.webpagetest.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResult extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: TestResult] (val x: Self) extends AnyVal {
    
    inline def setAverage(value: TestRun): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setBwDown(value: Double): Self = StObject.set(x, "bwDown", value.asInstanceOf[js.Any])
    
    inline def setBwUp(value: Double): Self = StObject.set(x, "bwUp", value.asInstanceOf[js.Any])
    
    inline def setCompleted(value: Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setConnectivity(value: String): Self = StObject.set(x, "connectivity", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFvonly(value: Boolean): Self = StObject.set(x, "fvonly", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setMedian(value: TestRun): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
    
    inline def setMobile(value: Double): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setPlr(value: String): Self = StObject.set(x, "plr", value.asInstanceOf[js.Any])
    
    inline def setRuns(value: StringDictionary[TestRun]): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    inline def setStandardDeviation(value: TestRun): Self = StObject.set(x, "standardDeviation", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulFVRuns(value: Double): Self = StObject.set(x, "successfulFVRuns", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setTestUrl(value: String): Self = StObject.set(x, "testUrl", value.asInstanceOf[js.Any])
    
    inline def setTester(value: String): Self = StObject.set(x, "tester", value.asInstanceOf[js.Any])
    
    inline def setTesterDNS(value: String): Self = StObject.set(x, "testerDNS", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
