package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildRequestValidationResult extends js.Object {
  /**
    * The message associated with the result.
    */
  var message: java.lang.String
  /**
    * The result.
    */
  var result: ValidationResult
}

object BuildRequestValidationResult {
  @scala.inline
  def apply(message: java.lang.String, result: ValidationResult): BuildRequestValidationResult = {
    val __obj = js.Dynamic.literal(message = message, result = result)
  
    __obj.asInstanceOf[BuildRequestValidationResult]
  }
}

