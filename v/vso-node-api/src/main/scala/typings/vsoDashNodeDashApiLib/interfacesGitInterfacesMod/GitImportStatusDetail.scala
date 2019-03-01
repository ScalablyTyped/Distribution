package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitImportStatusDetail extends js.Object {
  /**
    * All valid steps for the import process
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

object GitImportStatusDetail {
  @scala.inline
  def apply(allSteps: js.Array[java.lang.String], currentStep: scala.Double, errorMessage: java.lang.String): GitImportStatusDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allSteps")(allSteps)
    __obj.updateDynamic("currentStep")(currentStep)
    __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.asInstanceOf[GitImportStatusDetail]
  }
}

