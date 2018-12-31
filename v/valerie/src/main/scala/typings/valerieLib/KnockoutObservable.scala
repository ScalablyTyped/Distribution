package typings
package valerieLib

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
  def validate(): valerieLib.ValerieNs.PropertyValidationState[KnockoutObservable[T]] = js.native
  def validate(validationOptions: valerieLib.ValerieNs.ValidationOptions): valerieLib.ValerieNs.PropertyValidationState[KnockoutObservable[T]] = js.native
}

