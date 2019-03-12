package typings
package validatorjsLib.validatorjsMod.ValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: ValidationErrors
  def add(attribute: java.lang.String, message: java.lang.String): scala.Unit
  def all(): ValidationErrors
  def first(attribute: java.lang.String): java.lang.String | validatorjsLib.validatorjsLibNumbers.`false`
  def get(attribute: java.lang.String): js.Array[java.lang.String]
  def has(attribute: java.lang.String): scala.Boolean
}

object Errors {
  @scala.inline
  def apply(
    add: (java.lang.String, java.lang.String) => scala.Unit,
    all: () => ValidationErrors,
    errors: ValidationErrors,
    first: java.lang.String => java.lang.String | validatorjsLib.validatorjsLibNumbers.`false`,
    get: java.lang.String => js.Array[java.lang.String],
    has: java.lang.String => scala.Boolean
  ): Errors = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), all = js.Any.fromFunction0(all), errors = errors, first = js.Any.fromFunction1(first), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
  
    __obj.asInstanceOf[Errors]
  }
}

