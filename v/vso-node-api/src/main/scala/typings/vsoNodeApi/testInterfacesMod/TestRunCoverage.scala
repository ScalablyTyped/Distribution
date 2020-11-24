package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRunCoverage extends js.Object {
  
  var lastError: String = js.native
  
  var modules: js.Array[ModuleCoverage] = js.native
  
  var state: String = js.native
  
  var testRun: ShallowReference = js.native
}
object TestRunCoverage {
  
  @scala.inline
  def apply(lastError: String, modules: js.Array[ModuleCoverage], state: String, testRun: ShallowReference): TestRunCoverage = {
    val __obj = js.Dynamic.literal(lastError = lastError.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], testRun = testRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRunCoverage]
  }
  
  @scala.inline
  implicit class TestRunCoverageOps[Self <: TestRunCoverage] (val x: Self) extends AnyVal {
    
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
    def setLastError(value: String): Self = this.set("lastError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesVarargs(value: ModuleCoverage*): Self = this.set("modules", js.Array(value :_*))
    
    @scala.inline
    def setModules(value: js.Array[ModuleCoverage]): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestRun(value: ShallowReference): Self = this.set("testRun", value.asInstanceOf[js.Any])
  }
}
