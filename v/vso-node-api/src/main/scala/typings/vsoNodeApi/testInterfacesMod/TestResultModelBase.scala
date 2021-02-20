package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultModelBase extends StObject {
  
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
  implicit class TestResultModelBaseMutableBuilder[Self <: TestResultModelBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDate(value: Date): Self = StObject.set(x, "completedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInMs(value: Double): Self = StObject.set(x, "durationInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedDate(value: Date): Self = StObject.set(x, "startedDate", value.asInstanceOf[js.Any])
  }
}
