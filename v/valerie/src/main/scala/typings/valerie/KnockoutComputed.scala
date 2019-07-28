package typings.valerie

import typings.valerie.ValerieNs.PropertyValidationState
import typings.valerie.ValerieNs.ValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutComputed[T] extends js.Object {
  // starts validation for observable
  def validate(): PropertyValidationState[KnockoutComputed[T]] = js.native
  def validate(validationOptions: ValidationOptions): PropertyValidationState[KnockoutComputed[T]] = js.native
}

