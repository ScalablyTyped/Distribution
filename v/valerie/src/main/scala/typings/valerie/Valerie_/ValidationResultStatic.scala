package typings.valerie.Valerie_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationResultStatic extends js.Object {
  var passedInstance: ValidationResult
  // static method to create validatio failed message
  def createFailedResult(message: String): ValidationResult
}

object ValidationResultStatic {
  @scala.inline
  def apply(createFailedResult: String => ValidationResult, passedInstance: ValidationResult): ValidationResultStatic = {
    val __obj = js.Dynamic.literal(createFailedResult = js.Any.fromFunction1(createFailedResult), passedInstance = passedInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationResultStatic]
  }
}

