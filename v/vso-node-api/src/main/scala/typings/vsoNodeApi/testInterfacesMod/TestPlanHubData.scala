package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestPlanHubData extends StObject {
  
  var selectedSuiteId: Double = js.native
  
  var testPlan: TestPlan = js.native
  
  var testPoints: js.Array[TestPoint] = js.native
  
  var testSuites: js.Array[TestSuite] = js.native
  
  var totalTestPoints: Double = js.native
}
object TestPlanHubData {
  
  @scala.inline
  def apply(
    selectedSuiteId: Double,
    testPlan: TestPlan,
    testPoints: js.Array[TestPoint],
    testSuites: js.Array[TestSuite],
    totalTestPoints: Double
  ): TestPlanHubData = {
    val __obj = js.Dynamic.literal(selectedSuiteId = selectedSuiteId.asInstanceOf[js.Any], testPlan = testPlan.asInstanceOf[js.Any], testPoints = testPoints.asInstanceOf[js.Any], testSuites = testSuites.asInstanceOf[js.Any], totalTestPoints = totalTestPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlanHubData]
  }
  
  @scala.inline
  implicit class TestPlanHubDataMutableBuilder[Self <: TestPlanHubData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectedSuiteId(value: Double): Self = StObject.set(x, "selectedSuiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPlan(value: TestPlan): Self = StObject.set(x, "testPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPoints(value: js.Array[TestPoint]): Self = StObject.set(x, "testPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPointsVarargs(value: TestPoint*): Self = StObject.set(x, "testPoints", js.Array(value :_*))
    
    @scala.inline
    def setTestSuites(value: js.Array[TestSuite]): Self = StObject.set(x, "testSuites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSuitesVarargs(value: TestSuite*): Self = StObject.set(x, "testSuites", js.Array(value :_*))
    
    @scala.inline
    def setTotalTestPoints(value: Double): Self = StObject.set(x, "totalTestPoints", value.asInstanceOf[js.Any])
  }
}
