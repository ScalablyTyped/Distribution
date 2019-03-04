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
    add: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    all: js.Function0[ValidationErrors],
    errors: ValidationErrors,
    first: js.Function1[java.lang.String, java.lang.String | validatorjsLib.validatorjsLibNumbers.`false`],
    get: js.Function1[java.lang.String, js.Array[java.lang.String]],
    has: js.Function1[java.lang.String, scala.Boolean]
  ): Errors = {
    val __obj = js.Dynamic.literal(add = add, all = all, errors = errors, first = first, get = get, has = has)
  
    __obj.asInstanceOf[Errors]
  }
}

