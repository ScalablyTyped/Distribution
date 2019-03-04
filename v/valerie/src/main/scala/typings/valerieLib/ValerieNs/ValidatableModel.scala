package typings
package valerieLib.ValerieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatableModel[T] extends js.Object {
  // return original observableArray
  def end(): T
  def name(value: java.lang.String): PropertyValidationState[T]
}

object ValidatableModel {
  @scala.inline
  def apply[T](end: js.Function0[T], name: js.Function1[java.lang.String, PropertyValidationState[T]]): ValidatableModel[T] = {
    val __obj = js.Dynamic.literal(end = end, name = name)
  
    __obj.asInstanceOf[ValidatableModel[T]]
  }
}

