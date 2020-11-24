package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestPlan extends js.Object {
  
  var testPlan: scala.Double = js.native
  
  var testSuite: scala.Double = js.native
}
object TestPlan {
  
  @scala.inline
  def apply(testPlan: scala.Double, testSuite: scala.Double): TestPlan = {
    val __obj = js.Dynamic.literal(testPlan = testPlan.asInstanceOf[js.Any], testSuite = testSuite.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlan]
  }
  
  @scala.inline
  implicit class TestPlanOps[Self <: TestPlan] (val x: Self) extends AnyVal {
    
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
    def setTestPlan(value: scala.Double): Self = this.set("testPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSuite(value: scala.Double): Self = this.set("testSuite", value.asInstanceOf[js.Any])
  }
}
