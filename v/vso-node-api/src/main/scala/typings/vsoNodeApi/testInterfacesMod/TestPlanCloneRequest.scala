package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestPlanCloneRequest extends StObject {
  
  var destinationTestPlan: TestPlan = js.native
  
  var options: CloneOptions = js.native
  
  var suiteIds: js.Array[Double] = js.native
}
object TestPlanCloneRequest {
  
  @scala.inline
  def apply(destinationTestPlan: TestPlan, options: CloneOptions, suiteIds: js.Array[Double]): TestPlanCloneRequest = {
    val __obj = js.Dynamic.literal(destinationTestPlan = destinationTestPlan.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], suiteIds = suiteIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlanCloneRequest]
  }
  
  @scala.inline
  implicit class TestPlanCloneRequestMutableBuilder[Self <: TestPlanCloneRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationTestPlan(value: TestPlan): Self = StObject.set(x, "destinationTestPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: CloneOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuiteIds(value: js.Array[Double]): Self = StObject.set(x, "suiteIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuiteIdsVarargs(value: Double*): Self = StObject.set(x, "suiteIds", js.Array(value :_*))
  }
}
