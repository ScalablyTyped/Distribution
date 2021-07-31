package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestSuiteCloneRequest extends StObject {
  
  var cloneOptions: CloneOptions
  
  var destinationSuiteId: Double
  
  var destinationSuiteProjectName: String
}
object TestSuiteCloneRequest {
  
  @scala.inline
  def apply(cloneOptions: CloneOptions, destinationSuiteId: Double, destinationSuiteProjectName: String): TestSuiteCloneRequest = {
    val __obj = js.Dynamic.literal(cloneOptions = cloneOptions.asInstanceOf[js.Any], destinationSuiteId = destinationSuiteId.asInstanceOf[js.Any], destinationSuiteProjectName = destinationSuiteProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSuiteCloneRequest]
  }
  
  @scala.inline
  implicit class TestSuiteCloneRequestMutableBuilder[Self <: TestSuiteCloneRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloneOptions(value: CloneOptions): Self = StObject.set(x, "cloneOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationSuiteId(value: Double): Self = StObject.set(x, "destinationSuiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationSuiteProjectName(value: String): Self = StObject.set(x, "destinationSuiteProjectName", value.asInstanceOf[js.Any])
  }
}
