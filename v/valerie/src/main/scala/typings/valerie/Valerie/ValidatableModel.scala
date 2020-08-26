package typings.valerie.Valerie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatableModel[T] extends js.Object {
  // return original observableArray
  def end(): T = js.native
  def name(value: String): PropertyValidationState[T] = js.native
}

object ValidatableModel {
  @scala.inline
  def apply[T](end: () => T, name: String => PropertyValidationState[T]): ValidatableModel[T] = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), name = js.Any.fromFunction1(name))
    __obj.asInstanceOf[ValidatableModel[T]]
  }
  @scala.inline
  implicit class ValidatableModelOps[Self <: ValidatableModel[_], T] (val x: Self with ValidatableModel[T]) extends AnyVal {
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
    def setEnd(value: () => T): Self = this.set("end", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String => PropertyValidationState[T]): Self = this.set("name", js.Any.fromFunction1(value))
  }
  
}

