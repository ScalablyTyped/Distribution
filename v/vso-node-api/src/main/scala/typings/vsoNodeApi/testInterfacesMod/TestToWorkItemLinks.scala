package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestToWorkItemLinks extends StObject {
  
  var test: TestMethod = js.native
  
  var workItems: js.Array[WorkItemReference] = js.native
}
object TestToWorkItemLinks {
  
  @scala.inline
  def apply(test: TestMethod, workItems: js.Array[WorkItemReference]): TestToWorkItemLinks = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestToWorkItemLinks]
  }
  
  @scala.inline
  implicit class TestToWorkItemLinksMutableBuilder[Self <: TestToWorkItemLinks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTest(value: TestMethod): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItems(value: js.Array[WorkItemReference]): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemsVarargs(value: WorkItemReference*): Self = StObject.set(x, "workItems", js.Array(value :_*))
  }
}
