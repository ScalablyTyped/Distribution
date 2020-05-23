package typings.valerie.Valerie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatableModel[T] extends js.Object {
  // return original observableArray
  def end(): T
  def name(value: String): PropertyValidationState[T]
}

object ValidatableModel {
  @scala.inline
  def apply[T](end: () => T, name: String => PropertyValidationState[T]): ValidatableModel[T] = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), name = js.Any.fromFunction1(name))
    __obj.asInstanceOf[ValidatableModel[T]]
  }
}

