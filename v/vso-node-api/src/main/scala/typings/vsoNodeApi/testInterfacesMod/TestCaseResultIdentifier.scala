package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestCaseResultIdentifier extends js.Object {
  
  var testResultId: Double = js.native
  
  var testRunId: Double = js.native
}
object TestCaseResultIdentifier {
  
  @scala.inline
  def apply(testResultId: Double, testRunId: Double): TestCaseResultIdentifier = {
    val __obj = js.Dynamic.literal(testResultId = testResultId.asInstanceOf[js.Any], testRunId = testRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCaseResultIdentifier]
  }
  
  @scala.inline
  implicit class TestCaseResultIdentifierOps[Self <: TestCaseResultIdentifier] (val x: Self) extends AnyVal {
    
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
    def setTestResultId(value: Double): Self = this.set("testResultId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestRunId(value: Double): Self = this.set("testRunId", value.asInstanceOf[js.Any])
  }
}
