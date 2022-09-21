package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestToWorkItemLinks extends StObject {
  
  var test: TestMethod
  
  var workItems: js.Array[WorkItemReference]
}
object TestToWorkItemLinks {
  
  inline def apply(test: TestMethod, workItems: js.Array[WorkItemReference]): TestToWorkItemLinks = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestToWorkItemLinks]
  }
  
  extension [Self <: TestToWorkItemLinks](x: Self) {
    
    inline def setTest(value: TestMethod): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setWorkItems(value: js.Array[WorkItemReference]): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
    
    inline def setWorkItemsVarargs(value: WorkItemReference*): Self = StObject.set(x, "workItems", js.Array(value*))
  }
}
