package typings
package valerieLib.ValerieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationResultStatic extends js.Object {
  var passedInstance: ValidationResult
  // static method to create validatio failed message
  def createFailedResult(message: java.lang.String): ValidationResult
}

object ValidationResultStatic {
  @scala.inline
  def apply(
    createFailedResult: js.Function1[java.lang.String, ValidationResult],
    passedInstance: ValidationResult
  ): ValidationResultStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createFailedResult")(createFailedResult)
    __obj.updateDynamic("passedInstance")(passedInstance)
    __obj.asInstanceOf[ValidationResultStatic]
  }
}

