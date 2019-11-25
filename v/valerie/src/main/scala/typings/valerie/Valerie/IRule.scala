package typings.valerie.Valerie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRule extends js.Object {
  var defaultOptions: ValidationOptions
  def test(value: js.Any): ValidationResult
}

object IRule {
  @scala.inline
  def apply(defaultOptions: ValidationOptions, test: js.Any => ValidationResult): IRule = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
  
    __obj.asInstanceOf[IRule]
  }
}

