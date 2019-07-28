package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildRequestValidationResult extends js.Object {
  /**
    * The message associated with the result.
    */
  var message: String
  /**
    * The result.
    */
  var result: ValidationResult
}

object BuildRequestValidationResult {
  @scala.inline
  def apply(message: String, result: ValidationResult): BuildRequestValidationResult = {
    val __obj = js.Dynamic.literal(message = message, result = result)
  
    __obj.asInstanceOf[BuildRequestValidationResult]
  }
}

