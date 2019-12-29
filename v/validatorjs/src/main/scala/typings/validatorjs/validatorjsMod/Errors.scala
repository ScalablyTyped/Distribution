package typings.validatorjs.validatorjsMod

import typings.validatorjs.validatorjsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: ValidationErrors
  def add(attribute: String, message: String): Unit
  def all(): ValidationErrors
  def first(attribute: String): String | `false`
  def get(attribute: String): js.Array[String]
  def has(attribute: String): Boolean
}

object Errors {
  @scala.inline
  def apply(
    add: (String, String) => Unit,
    all: () => ValidationErrors,
    errors: ValidationErrors,
    first: String => String | `false`,
    get: String => js.Array[String],
    has: String => Boolean
  ): Errors = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), all = js.Any.fromFunction0(all), errors = errors.asInstanceOf[js.Any], first = js.Any.fromFunction1(first), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
  
    __obj.asInstanceOf[Errors]
  }
}

