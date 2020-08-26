package typings.validatorjs.mod

import typings.validatorjs.validatorjsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Errors extends js.Object {
  var errors: ValidationErrors = js.native
  def add(attribute: String, message: String): Unit = js.native
  def all(): ValidationErrors = js.native
  def first(attribute: String): String | `false` = js.native
  def get(attribute: String): js.Array[String] = js.native
  def has(attribute: String): Boolean = js.native
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
  @scala.inline
  implicit class ErrorsOps[Self <: Errors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: (String, String) => Unit): Self = this.set("add", js.Any.fromFunction2(value))
    @scala.inline
    def setAll(value: () => ValidationErrors): Self = this.set("all", js.Any.fromFunction0(value))
    @scala.inline
    def setErrors(value: ValidationErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirst(value: String => String | `false`): Self = this.set("first", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: String => js.Array[String]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
  }
  
}

