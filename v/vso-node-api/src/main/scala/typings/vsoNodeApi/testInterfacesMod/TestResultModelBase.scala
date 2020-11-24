package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultModelBase extends js.Object {
  
  var comment: String = js.native
  
  var completedDate: Date = js.native
  
  var durationInMs: Double = js.native
  
  var errorMessage: String = js.native
  
  var outcome: String = js.native
  
  var startedDate: Date = js.native
}
object TestResultModelBase {
  
  @scala.inline
  def apply(
    comment: String,
    completedDate: Date,
    durationInMs: Double,
    errorMessage: String,
    outcome: String,
    startedDate: Date
  ): TestResultModelBase = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], durationInMs = durationInMs.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultModelBase]
  }
  
  @scala.inline
  implicit class TestResultModelBaseOps[Self <: TestResultModelBase] (val x: Self) extends AnyVal {
    
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDate(value: Date): Self = this.set("completedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInMs(value: Double): Self = this.set("durationInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcome(value: String): Self = this.set("outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedDate(value: Date): Self = this.set("startedDate", value.asInstanceOf[js.Any])
  }
}
