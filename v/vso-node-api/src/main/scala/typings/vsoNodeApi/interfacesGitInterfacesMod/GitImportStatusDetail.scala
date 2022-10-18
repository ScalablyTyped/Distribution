package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitImportStatusDetail extends StObject {
  
  /**
    * All valid steps for the import process
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
object GitImportStatusDetail {
  
  inline def apply(allSteps: js.Array[String], currentStep: Double, errorMessage: String): GitImportStatusDetail = {
    val __obj = js.Dynamic.literal(allSteps = allSteps.asInstanceOf[js.Any], currentStep = currentStep.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitImportStatusDetail]
  }
  
  extension [Self <: GitImportStatusDetail](x: Self) {
    
    inline def setAllSteps(value: js.Array[String]): Self = StObject.set(x, "allSteps", value.asInstanceOf[js.Any])
    
    inline def setAllStepsVarargs(value: String*): Self = StObject.set(x, "allSteps", js.Array(value*))
    
    inline def setCurrentStep(value: Double): Self = StObject.set(x, "currentStep", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
  }
}
