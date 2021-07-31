package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuiteTestCase extends StObject {
  
  var pointAssignments: js.Array[PointAssignment]
  
  var testCase: WorkItemReference
}
object SuiteTestCase {
  
  @scala.inline
  def apply(pointAssignments: js.Array[PointAssignment], testCase: WorkItemReference): SuiteTestCase = {
    val __obj = js.Dynamic.literal(pointAssignments = pointAssignments.asInstanceOf[js.Any], testCase = testCase.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteTestCase]
  }
  
  @scala.inline
  implicit class SuiteTestCaseMutableBuilder[Self <: SuiteTestCase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPointAssignments(value: js.Array[PointAssignment]): Self = StObject.set(x, "pointAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointAssignmentsVarargs(value: PointAssignment*): Self = StObject.set(x, "pointAssignments", js.Array(value :_*))
    
    @scala.inline
    def setTestCase(value: WorkItemReference): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
  }
}
