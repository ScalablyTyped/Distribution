package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestSuiteCloneRequest extends StObject {
  
  var cloneOptions: CloneOptions
  
  var destinationSuiteId: Double
  
  var destinationSuiteProjectName: String
}
object TestSuiteCloneRequest {
  
  inline def apply(cloneOptions: CloneOptions, destinationSuiteId: Double, destinationSuiteProjectName: String): TestSuiteCloneRequest = {
    val __obj = js.Dynamic.literal(cloneOptions = cloneOptions.asInstanceOf[js.Any], destinationSuiteId = destinationSuiteId.asInstanceOf[js.Any], destinationSuiteProjectName = destinationSuiteProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSuiteCloneRequest]
  }
  
  extension [Self <: TestSuiteCloneRequest](x: Self) {
    
    inline def setCloneOptions(value: CloneOptions): Self = StObject.set(x, "cloneOptions", value.asInstanceOf[js.Any])
    
    inline def setDestinationSuiteId(value: Double): Self = StObject.set(x, "destinationSuiteId", value.asInstanceOf[js.Any])
    
    inline def setDestinationSuiteProjectName(value: String): Self = StObject.set(x, "destinationSuiteProjectName", value.asInstanceOf[js.Any])
  }
}
