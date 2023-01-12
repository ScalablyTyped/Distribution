package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPlansWithSelection extends StObject {
  
  var lastSelectedPlan: Double
  
  var lastSelectedSuite: Double
  
  var plans: js.Array[TestPlan]
}
object TestPlansWithSelection {
  
  inline def apply(lastSelectedPlan: Double, lastSelectedSuite: Double, plans: js.Array[TestPlan]): TestPlansWithSelection = {
    val __obj = js.Dynamic.literal(lastSelectedPlan = lastSelectedPlan.asInstanceOf[js.Any], lastSelectedSuite = lastSelectedSuite.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlansWithSelection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestPlansWithSelection] (val x: Self) extends AnyVal {
    
    inline def setLastSelectedPlan(value: Double): Self = StObject.set(x, "lastSelectedPlan", value.asInstanceOf[js.Any])
    
    inline def setLastSelectedSuite(value: Double): Self = StObject.set(x, "lastSelectedSuite", value.asInstanceOf[js.Any])
    
    inline def setPlans(value: js.Array[TestPlan]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setPlansVarargs(value: TestPlan*): Self = StObject.set(x, "plans", js.Array(value*))
  }
}
