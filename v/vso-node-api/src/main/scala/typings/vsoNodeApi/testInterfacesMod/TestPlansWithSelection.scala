package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPlansWithSelection extends StObject {
  
  var lastSelectedPlan: Double
  
  var lastSelectedSuite: Double
  
  var plans: js.Array[TestPlan]
}
object TestPlansWithSelection {
  
  @scala.inline
  def apply(lastSelectedPlan: Double, lastSelectedSuite: Double, plans: js.Array[TestPlan]): TestPlansWithSelection = {
    val __obj = js.Dynamic.literal(lastSelectedPlan = lastSelectedPlan.asInstanceOf[js.Any], lastSelectedSuite = lastSelectedSuite.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlansWithSelection]
  }
  
  @scala.inline
  implicit class TestPlansWithSelectionMutableBuilder[Self <: TestPlansWithSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastSelectedPlan(value: Double): Self = StObject.set(x, "lastSelectedPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSelectedSuite(value: Double): Self = StObject.set(x, "lastSelectedSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlans(value: js.Array[TestPlan]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlansVarargs(value: TestPlan*): Self = StObject.set(x, "plans", js.Array(value :_*))
  }
}
