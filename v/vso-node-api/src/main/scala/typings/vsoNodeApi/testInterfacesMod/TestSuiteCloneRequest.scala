package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestSuiteCloneRequest extends js.Object {
  
  var cloneOptions: CloneOptions = js.native
  
  var destinationSuiteId: Double = js.native
  
  var destinationSuiteProjectName: String = js.native
}
object TestSuiteCloneRequest {
  
  @scala.inline
  def apply(cloneOptions: CloneOptions, destinationSuiteId: Double, destinationSuiteProjectName: String): TestSuiteCloneRequest = {
    val __obj = js.Dynamic.literal(cloneOptions = cloneOptions.asInstanceOf[js.Any], destinationSuiteId = destinationSuiteId.asInstanceOf[js.Any], destinationSuiteProjectName = destinationSuiteProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSuiteCloneRequest]
  }
  
  @scala.inline
  implicit class TestSuiteCloneRequestOps[Self <: TestSuiteCloneRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloneOptions(value: CloneOptions): Self = this.set("cloneOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationSuiteId(value: Double): Self = this.set("destinationSuiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationSuiteProjectName(value: String): Self = this.set("destinationSuiteProjectName", value.asInstanceOf[js.Any])
  }
}
