package typings
package valerieLib.ValerieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The interface for a validation state.
@js.native
trait IValidationState extends js.Object {
  def failed(): scala.Boolean = js.native
  def getName(): java.lang.String = js.native
  def isApplicable(): scala.Boolean = js.native
  def message(): java.lang.String = js.native
  def passed(): scala.Boolean = js.native
  def pending(): scala.Boolean = js.native
  def result(): ValidationResult = js.native
  def touched(): scala.Boolean = js.native
  def touched(value: scala.Boolean): scala.Boolean = js.native
}

