package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPlanCloneRequest extends StObject {
  
  var destinationTestPlan: TestPlan
  
  var options: CloneOptions
  
  var suiteIds: js.Array[Double]
}
object TestPlanCloneRequest {
  
  inline def apply(destinationTestPlan: TestPlan, options: CloneOptions, suiteIds: js.Array[Double]): TestPlanCloneRequest = {
    val __obj = js.Dynamic.literal(destinationTestPlan = destinationTestPlan.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], suiteIds = suiteIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlanCloneRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestPlanCloneRequest] (val x: Self) extends AnyVal {
    
    inline def setDestinationTestPlan(value: TestPlan): Self = StObject.set(x, "destinationTestPlan", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: CloneOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSuiteIds(value: js.Array[Double]): Self = StObject.set(x, "suiteIds", value.asInstanceOf[js.Any])
    
    inline def setSuiteIdsVarargs(value: Double*): Self = StObject.set(x, "suiteIds", js.Array(value*))
  }
}
