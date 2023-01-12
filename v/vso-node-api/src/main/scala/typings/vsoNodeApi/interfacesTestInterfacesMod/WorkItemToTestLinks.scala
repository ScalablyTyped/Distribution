package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemToTestLinks extends StObject {
  
  var tests: js.Array[TestMethod]
  
  var workItem: WorkItemReference
}
object WorkItemToTestLinks {
  
  inline def apply(tests: js.Array[TestMethod], workItem: WorkItemReference): WorkItemToTestLinks = {
    val __obj = js.Dynamic.literal(tests = tests.asInstanceOf[js.Any], workItem = workItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemToTestLinks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkItemToTestLinks] (val x: Self) extends AnyVal {
    
    inline def setTests(value: js.Array[TestMethod]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    
    inline def setTestsVarargs(value: TestMethod*): Self = StObject.set(x, "tests", js.Array(value*))
    
    inline def setWorkItem(value: WorkItemReference): Self = StObject.set(x, "workItem", value.asInstanceOf[js.Any])
  }
}
