package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPlanHubData extends StObject {
  
  var selectedSuiteId: Double
  
  var testPlan: TestPlan
  
  var testPoints: js.Array[TestPoint]
  
  var testSuites: js.Array[TestSuite]
  
  var totalTestPoints: Double
}
object TestPlanHubData {
  
  inline def apply(
    selectedSuiteId: Double,
    testPlan: TestPlan,
    testPoints: js.Array[TestPoint],
    testSuites: js.Array[TestSuite],
    totalTestPoints: Double
  ): TestPlanHubData = {
    val __obj = js.Dynamic.literal(selectedSuiteId = selectedSuiteId.asInstanceOf[js.Any], testPlan = testPlan.asInstanceOf[js.Any], testPoints = testPoints.asInstanceOf[js.Any], testSuites = testSuites.asInstanceOf[js.Any], totalTestPoints = totalTestPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlanHubData]
  }
  
  extension [Self <: TestPlanHubData](x: Self) {
    
    inline def setSelectedSuiteId(value: Double): Self = StObject.set(x, "selectedSuiteId", value.asInstanceOf[js.Any])
    
    inline def setTestPlan(value: TestPlan): Self = StObject.set(x, "testPlan", value.asInstanceOf[js.Any])
    
    inline def setTestPoints(value: js.Array[TestPoint]): Self = StObject.set(x, "testPoints", value.asInstanceOf[js.Any])
    
    inline def setTestPointsVarargs(value: TestPoint*): Self = StObject.set(x, "testPoints", js.Array(value*))
    
    inline def setTestSuites(value: js.Array[TestSuite]): Self = StObject.set(x, "testSuites", value.asInstanceOf[js.Any])
    
    inline def setTestSuitesVarargs(value: TestSuite*): Self = StObject.set(x, "testSuites", js.Array(value*))
    
    inline def setTotalTestPoints(value: Double): Self = StObject.set(x, "totalTestPoints", value.asInstanceOf[js.Any])
  }
}
