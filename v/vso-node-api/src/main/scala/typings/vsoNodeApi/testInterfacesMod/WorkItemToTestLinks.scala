package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemToTestLinks extends StObject {
  
  var tests: js.Array[TestMethod] = js.native
  
  var workItem: WorkItemReference = js.native
}
object WorkItemToTestLinks {
  
  @scala.inline
  def apply(tests: js.Array[TestMethod], workItem: WorkItemReference): WorkItemToTestLinks = {
    val __obj = js.Dynamic.literal(tests = tests.asInstanceOf[js.Any], workItem = workItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemToTestLinks]
  }
  
  @scala.inline
  implicit class WorkItemToTestLinksMutableBuilder[Self <: WorkItemToTestLinks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTests(value: js.Array[TestMethod]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestsVarargs(value: TestMethod*): Self = StObject.set(x, "tests", js.Array(value :_*))
    
    @scala.inline
    def setWorkItem(value: WorkItemReference): Self = StObject.set(x, "workItem", value.asInstanceOf[js.Any])
  }
}
