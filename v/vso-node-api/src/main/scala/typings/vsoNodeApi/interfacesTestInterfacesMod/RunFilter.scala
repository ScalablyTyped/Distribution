package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunFilter extends StObject {
  
  /**
    * filter for the test case sources (test containers)
    */
  var sourceFilter: String
  
  /**
    * filter for the test cases
    */
  var testCaseFilter: String
}
object RunFilter {
  
  inline def apply(sourceFilter: String, testCaseFilter: String): RunFilter = {
    val __obj = js.Dynamic.literal(sourceFilter = sourceFilter.asInstanceOf[js.Any], testCaseFilter = testCaseFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunFilter] (val x: Self) extends AnyVal {
    
    inline def setSourceFilter(value: String): Self = StObject.set(x, "sourceFilter", value.asInstanceOf[js.Any])
    
    inline def setTestCaseFilter(value: String): Self = StObject.set(x, "testCaseFilter", value.asInstanceOf[js.Any])
  }
}
