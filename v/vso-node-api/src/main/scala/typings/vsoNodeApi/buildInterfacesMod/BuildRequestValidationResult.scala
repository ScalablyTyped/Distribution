package typings.vsoNodeApi.buildInterfacesMod

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
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildRequestValidationResult]
  }
}

