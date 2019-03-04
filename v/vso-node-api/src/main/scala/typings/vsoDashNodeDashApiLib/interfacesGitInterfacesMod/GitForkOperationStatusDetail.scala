package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitForkOperationStatusDetail extends js.Object {
  /**
    * All valid steps for the forking process
    */
  var allSteps: js.Array[java.lang.String]
  /**
    * Index into AllSteps for the current step
    */
  var currentStep: scala.Double
  /**
    * Error message if the operation failed.
    */
  var errorMessage: java.lang.String
}

object GitForkOperationStatusDetail {
  @scala.inline
  def apply(allSteps: js.Array[java.lang.String], currentStep: scala.Double, errorMessage: java.lang.String): GitForkOperationStatusDetail = {
    val __obj = js.Dynamic.literal(allSteps = allSteps, currentStep = currentStep, errorMessage = errorMessage)
  
    __obj.asInstanceOf[GitForkOperationStatusDetail]
  }
}

