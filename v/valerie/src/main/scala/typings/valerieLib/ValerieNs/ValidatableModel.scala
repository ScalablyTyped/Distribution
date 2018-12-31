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

