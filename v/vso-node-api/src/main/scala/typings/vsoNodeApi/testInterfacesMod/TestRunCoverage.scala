package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRunCoverage extends StObject {
  
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
  implicit class TestRunCoverageMutableBuilder[Self <: TestRunCoverage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastError(value: String): Self = StObject.set(x, "lastError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModules(value: js.Array[ModuleCoverage]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesVarargs(value: ModuleCoverage*): Self = StObject.set(x, "modules", js.Array(value :_*))
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestRun(value: ShallowReference): Self = StObject.set(x, "testRun", value.asInstanceOf[js.Any])
  }
}
