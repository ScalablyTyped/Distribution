package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitForkOperationStatusDetail extends js.Object {
  /**
    * All valid steps for the forking process
    */
  var allSteps: js.Array[String] = js.native
  /**
    * Index into AllSteps for the current step
    */
  var currentStep: Double = js.native
  /**
    * Error message if the operation failed.
    */
  var errorMessage: String = js.native
}

object GitForkOperationStatusDetail {
  @scala.inline
  def apply(allSteps: js.Array[String], currentStep: Double, errorMessage: String): GitForkOperationStatusDetail = {
    val __obj = js.Dynamic.literal(allSteps = allSteps.asInstanceOf[js.Any], currentStep = currentStep.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitForkOperationStatusDetail]
  }
  @scala.inline
  implicit class GitForkOperationStatusDetailOps[Self <: GitForkOperationStatusDetail] (val x: Self) extends AnyVal {
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
    def setAllStepsVarargs(value: String*): Self = this.set("allSteps", js.Array(value :_*))
    @scala.inline
    def setAllSteps(value: js.Array[String]): Self = this.set("allSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentStep(value: Double): Self = this.set("currentStep", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
  }
  
}

