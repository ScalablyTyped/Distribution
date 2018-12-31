package typings
package valerieLib.ValerieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationState extends js.Object {
  // Finds and returns the validation states
  def findIn(model: js.Any): js.Array[IValidationState] = js.native
  def findIn(model: js.Any, includeSubModels: scala.Boolean): js.Array[IValidationState] = js.native
  def findIn(model: js.Any, includeSubModels: scala.Boolean, recurse: scala.Boolean): js.Array[IValidationState] = js.native
  def findIn(
    model: js.Any,
    includeSubModels: scala.Boolean,
    recurse: scala.Boolean,
    validationStates: js.Array[IValidationState]
  ): js.Array[IValidationState] = js.native
  // Gets the validation state for the given model, observable or computed.
  def getFor(modelOrObservableOrComputed: js.Any): IValidationState = js.native
  // nforms if the given model, observable or computed has a validation state.
  def has(modelOrObservableOrComputed: js.Any): scala.Boolean = js.native
  // Sets the validation state for the given model, observable or computed.
  def setFor(modelOrObservableOrComputed: js.Any, state: IValidationState): scala.Unit = js.native
}

