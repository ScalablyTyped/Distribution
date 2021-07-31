package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitForkOperationStatusDetail extends StObject {
  
  /**
    * All valid steps for the forking process
    */
  var allSteps: js.Array[String]
  
  /**
    * Index into AllSteps for the current step
    */
  var currentStep: Double
  
  /**
    * Error message if the operation failed.
    */
  var errorMessage: String
}
object GitForkOperationStatusDetail {
  
  @scala.inline
  def apply(allSteps: js.Array[String], currentStep: Double, errorMessage: String): GitForkOperationStatusDetail = {
    val __obj = js.Dynamic.literal(allSteps = allSteps.asInstanceOf[js.Any], currentStep = currentStep.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitForkOperationStatusDetail]
  }
  
  @scala.inline
  implicit class GitForkOperationStatusDetailMutableBuilder[Self <: GitForkOperationStatusDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllSteps(value: js.Array[String]): Self = StObject.set(x, "allSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllStepsVarargs(value: String*): Self = StObject.set(x, "allSteps", js.Array(value :_*))
    
    @scala.inline
    def setCurrentStep(value: Double): Self = StObject.set(x, "currentStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
  }
}
