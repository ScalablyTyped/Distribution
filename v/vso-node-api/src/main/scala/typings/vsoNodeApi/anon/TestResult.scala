package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResult extends StObject {
  
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
  implicit class TestResultMutableBuilder[Self <: TestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: scala.Double): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResult(value: scala.Double): Self = StObject.set(x, "testResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestRun(value: scala.Double): Self = StObject.set(x, "testRun", value.asInstanceOf[js.Any])
  }
}
