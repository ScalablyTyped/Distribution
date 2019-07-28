package typings.valerie

import typings.valerie.ValerieNs.PropertyValidationState
import typings.valerie.ValerieNs.ValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Extensions to KO functions to provide validation
  *
  * Version 1.2 - added more static methods to valerie object
  *
  */
@js.native
trait KnockoutObservable[T] extends js.Object {
  // starts validation for observable
  def validate(): PropertyValidationState[KnockoutObservable[T]] = js.native
  def validate(validationOptions: ValidationOptions): PropertyValidationState[KnockoutObservable[T]] = js.native
}

