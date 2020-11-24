package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResult extends js.Object {
  
  var all: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var system: scala.Double = js.native
  
  var testResult: scala.Double = js.native
  
  var testRun: scala.Double = js.native
}
object TestResult {
  
  @scala.inline
  def apply(
    all: scala.Double,
    none: scala.Double,
    system: scala.Double,
    testResult: scala.Double,
    testRun: scala.Double
  ): TestResult = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], testResult = testResult.asInstanceOf[js.Any], testRun = testRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
  
  @scala.inline
  implicit class TestResultOps[Self <: TestResult] (val x: Self) extends AnyVal {
    
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
    def setAll(value: scala.Double): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: scala.Double): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResult(value: scala.Double): Self = this.set("testResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestRun(value: scala.Double): Self = this.set("testRun", value.asInstanceOf[js.Any])
  }
}
