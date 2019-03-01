package typings
package valerieLib.ValerieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRule extends js.Object {
  var defaultOptions: ValidationOptions
  def test(value: js.Any): ValidationResult
}

object IRule {
  @scala.inline
  def apply(defaultOptions: ValidationOptions, test: js.Function1[js.Any, ValidationResult]): IRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultOptions")(defaultOptions)
    __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[IRule]
  }
}

