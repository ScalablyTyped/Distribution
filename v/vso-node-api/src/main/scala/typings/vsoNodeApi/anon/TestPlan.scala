package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPlan extends StObject {
  
  var testPlan: scala.Double
  
  var testSuite: scala.Double
}
object TestPlan {
  
  @scala.inline
  def apply(testPlan: scala.Double, testSuite: scala.Double): TestPlan = {
    val __obj = js.Dynamic.literal(testPlan = testPlan.asInstanceOf[js.Any], testSuite = testSuite.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlan]
  }
  
  @scala.inline
  implicit class TestPlanMutableBuilder[Self <: TestPlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTestPlan(value: scala.Double): Self = StObject.set(x, "testPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSuite(value: scala.Double): Self = StObject.set(x, "testSuite", value.asInstanceOf[js.Any])
  }
}
